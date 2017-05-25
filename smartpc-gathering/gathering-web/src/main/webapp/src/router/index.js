import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '首页',
      redirect: '/login'
    },
    {
      path: '/login',
      component: resolve => require(['../components/login/Login.vue'], resolve)
    },{
      path: '/home',
      component: resolve => require(['../components/homepage/Home.vue'], resolve),
      children:[
        {
          path: '/form',
          component: resolve => require(['../components/demo/FormTest.vue'], resolve),
        },
        {
          path: '/chart',
          component: resolve => require(['../components/demo/BaseCharts.vue'], resolve),
        },
        {
          path: '/table',
          component: resolve => require(['../components/demo/BaseTable.vue'], resolve),
        }
      ]
    }
  ]
})
