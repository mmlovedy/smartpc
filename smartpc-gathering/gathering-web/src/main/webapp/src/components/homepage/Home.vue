<template>
    <div class="app-wrapper" :class="{hideSidebar:!sidebar.opened}">
      <div class="sidebar-wrapper">
        <v-sidebar class="sidebar-container"></v-sidebar>
      </div>
      <div class="main-container">
        <v-head></v-head>
        <v-content></v-content>
      </div>
    </div>
</template>

<script>
    import vHead from './Header.vue';
    import vSidebar from './Sidebar.vue';
    import vContent from './Content.vue';
    export default {
        components:{
          vSidebar,vHead, vContent
        },
        computed: {
          sidebar() {
            return this.$store.state.app.sidebar;
          }
        }
    }
</script>
<style rel="stylesheet/scss" lang="scss" scoped>
  @import "src/static/style/scss/mixin.scss";

  .app-wrapper {
    @include clearfix;
    position: relative;
    height: 100%;
    width: 100%;
    &.hideSidebar {
      .sidebar-wrapper {
        transform: translate(-142px, 0);
        .sidebar-container {
          transform: translate(136px, 0);
        }
        &:hover {
          transform: translate(0, 0);
          .sidebar-container {
            transform: translate(0, 0);
          }
        }
      }
      .main-container{
        margin-left: 40px;
      }
    }
    .sidebar-wrapper {
      width: 180px;
      position: fixed;
      top: 0;
      bottom: 0;
      left: 0;
      z-index: 1001;
      overflow-x: hidden;
      transition: all .28s ease-out;
      @include scrollBar;
    }
    .sidebar-container {
      transition: all .28s ease-out;
    }
    .main-container {
      margin-left: 180px;
      min-height: 100%;
      transition: all .28s ease-out;
    }
  }
</style>





