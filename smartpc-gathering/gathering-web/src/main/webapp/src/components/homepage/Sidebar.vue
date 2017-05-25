<template>
    <div class="sidebar">
        <el-menu :default-active="onRoutes" theme="dark" mode="vertical" unique-opened router>
            <el-menu-item index="readme" class="title-link">
                <i class="el-icon-setting"></i>自述
            </el-menu-item>
            <el-submenu index="2" class="title-link">
                <template slot="title"><i class="el-icon-menu"></i>表格</template>
                <el-menu-item index="table">基础表格</el-menu-item>
                <el-menu-item index="vuetable">Vue表格组件</el-menu-item>
            </el-submenu>
            <el-submenu index="3" class="title-link">
                <template slot="title"><i class="el-icon-date"></i>表单</template>
                <el-menu-item index="form">基本表单</el-menu-item>
                <el-menu-item index="vueeditor">编辑器</el-menu-item>
                <el-menu-item index="markdown">markdown</el-menu-item>
                <el-menu-item index="upload">文件上传</el-menu-item>
            </el-submenu>
            <el-submenu index="4" class="title-link">
                <template slot="title"><i class="el-icon-star-on"></i>图表</template>
                <el-menu-item index="chart">基础图表</el-menu-item>
                <el-menu-item index="mixcharts">混合图表</el-menu-item>
            </el-submenu>
        </el-menu>
    </div>
</template>

<script>
    export default {
      name: 'Sidebar',
      computed:{
            onRoutes(){
                return this.$route.path.replace('/','');
            }
        },
        methods:{
//            menuClick(menuItem){
//                const tab = {
//                    title: menuItem.value,
//                    path: '/'+menuItem.index
//                }
//                this.$store.dispatch('addNewTab',tab);
//            }
        }
    }
</script>

<style scoped>
    .sidebar{
      height: 100%;
    }
    .el-menu {
      border-radius: 0px !important;
      min-height: 100%;
    }
    .wscn-icon {
      margin-right: 10px;
    }
    .hideSidebar .title-link{
      display: block;
      text-indent: 0px;
    }
</style>
