<template>
  <div class="content">
   <!-- <el-tabs v-model="editableTabsValue2" type="card" closable @tab-remove="removeTab" @tab-click="clickTab">
      <el-tab-pane v-for="(item, index) in editableTabs2"
                   :key="item.name"
                   :label="item.title"
                   :name="item.name">
      </el-tab-pane>
    </el-tabs>-->
    <router-view></router-view>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        editableTabsValue2: this.$store.state.content.editableTabsValue2,
        editableTabs2: this.$store.state.content.editableTabs2,
        tabIndex: this.$store.state.content.tabIndex
      }
    },
    methods:{
      removeTab(targetName){
        let tabs = this.editableTabs2;
        let activeName = this.editableTabsValue2;
        if (activeName === targetName) {
          tabs.forEach((tab, index) => {
            if (tab.name === targetName) {
              let nextTab = tabs[index + 1] || tabs[index - 1];
              if (nextTab) {
                activeName = nextTab.name;
              }
            }
          });
        }
        this.editableTabsValue2 = activeName;
        this.editableTabs2 = tabs.filter(tab => tab.name !== targetName);
        //打开激活 tab 的页面
        this.$router.push(activeName);
      },
      clickTab(tab){
        this.$router.push(tab.name);
      }
    }
  }
</script>
<style>
  .content{
    background: none repeat scroll 0 0 #fff;
    position: absolute;
    width: 87%;
    top: 50px;
    bottom:0;
    padding:20px;
    box-sizing: border-box;
    overflow-y: scroll;
  }
</style>
