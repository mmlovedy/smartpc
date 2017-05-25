<template>
  <el-menu class="header" mode="horizontal">
      <Hamburger class="hamburger-container" :toggleClick="toggleSideBar" :isActive="sidebar.opened"></Hamburger>
      <levelBar></levelBar>
        <div class="user-info">
            <el-dropdown trigger="click" @command="handleCommand">
                <span class="el-dropdown-link">
                    <img class="user-logo" src="../../static/img/lufei.png">
                    {{username}}
                </span>
                <el-dropdown-menu slot="dropdown">
                    <el-dropdown-item command="loginout">退出</el-dropdown-item>
                </el-dropdown-menu>
            </el-dropdown>
        </div>
  </el-menu>
</template>
<script>
  import Hamburger from '../common/Hamburger';
  import levelBar from './Levelbar.vue';
  import { mapGetters } from 'vuex'
  export default {
      components:{
        Hamburger,
        levelBar
      },
      data() {
          return {
              name: 'deyun'
          }
      },
      computed:{
          username(){
              let username = localStorage.getItem('ms_username');
              return username ? username : this.name;
          }
         ,
          ...mapGetters([
            'sidebar'
          ])
      },
      methods:{
          handleCommand(command) {
              if(command == 'loginout'){
                  localStorage.removeItem('ms_username')
                  this.$router.push('/login');
              }
          },
          toggleSideBar() {
            this.$store.dispatch('ToggleSideBar')
          },
      }
    }
</script>
<style scoped>
    .header {
        border-radius: 0px !important;
        position: absolute;
        box-sizing: border-box;
        width:  100%;
        height: 50px;
        font-size: 20px;
        line-height: 50px;
        top: 0px;
        color: #fff;
        background-color: #EAEDF4;
    }
    .header .logo{
        float: left;
        width: 220px;
        text-align: center ;
        vertical-align: middle;
    }
    .user-info {
        float: right;
        position: absolute;
        right: 240px;
        font-size: 16px;
        color: #fff;
        top:2px;
    }
    .user-info .el-dropdown-link{
        position: relative;
        display: inline-block;
        padding-left: 50px;
        color: #fff;
        cursor: pointer;
        vertical-align: middle;
    }
    .user-info .user-logo{
        position: absolute;
        left:0;
        top:4px;
        width:40px;
        height:40px;
        border-radius: 50%;
    }

    .hamburger-container {
      line-height: 58px;
      height: 50px;
      float: left;
      padding: 0 10px;
    }
</style>
