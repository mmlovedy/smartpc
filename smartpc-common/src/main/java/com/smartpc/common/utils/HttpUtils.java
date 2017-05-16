package com.smartpc.common.utils;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.AsyncClientHttpRequest;
import org.springframework.http.client.AsyncClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsAsyncClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 刘德云
 * @version V1.0
 * @Title: HttpUtils
 * @Package com.springmvc
 * @date 2017/4/12 上午9:08
 */
public class HttpUtils {

    private static RestTemplate restTemplate;

    private static AsyncRestTemplate asyncRestTemplate;

    /**
     * 获取头部
     *
     * @return
     */
    public static HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        return headers;
    }

    /**
     * 同步调用模板
     * @return
     */
    public static RestTemplate getHttpTemplet(){
        if( restTemplate == null ){
            restTemplate = new RestTemplate();
            // 连接工厂
            HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(
                    getHttpClient());
            restTemplate.setRequestFactory(clientHttpRequestFactory);

            restTemplate.setMessageConverters(getHttpMessageConverterList());
        }
        return restTemplate;
    }

    /**
     * 异步调用模板
     * @return
     */
    public static AsyncRestTemplate getAsyncRestTemplate(){
        if( asyncRestTemplate == null ){
            asyncRestTemplate = new AsyncRestTemplate();
        }
        asyncRestTemplate.setMessageConverters(getHttpMessageConverterList());
        return asyncRestTemplate;
    }

    /**
     * 设置字符集编码，避免乱码
     * @return
     */
    public static List<HttpMessageConverter<?>> getHttpMessageConverterList(){
        StringHttpMessageConverter m = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        List<HttpMessageConverter<?>> list = new ArrayList<HttpMessageConverter<?>>();
        list.add(m);
        return list;
    }

    /**
     * 获取 http 配置
     * @return
     */
    public static HttpClient getHttpClient(){
        // httpClient连接池配置
        PoolingHttpClientConnectionManager pollingConnectionManager = new PoolingHttpClientConnectionManager();
        pollingConnectionManager.setMaxTotal(1000);
        pollingConnectionManager.setDefaultMaxPerRoute(1000);
        RequestConfig.Builder requestBuilder = RequestConfig.custom();
        // 连接超时时间
        requestBuilder = requestBuilder.setConnectTimeout(30 * 1000);
        // 从连接池中获取连接超时时间
        requestBuilder = requestBuilder.setConnectionRequestTimeout(30 * 1000);
        // 读取超时时间
        requestBuilder = requestBuilder.setSocketTimeout(60 * 1000);
        // 初始化httpClient
        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(requestBuilder.build())
                .setConnectionManager(pollingConnectionManager).build();
        return httpClient;
    }
}
