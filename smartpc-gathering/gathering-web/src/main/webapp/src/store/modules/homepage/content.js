import * as types from '../../mutation-types'
const state ={
  editableTabsValue2: '2',
  editableTabs2: [{
    title: '基本表单',
    name: '/form'
  }, {
    title: '基本图形',
    name: '/chart'
  }],
  tabIndex: 2
}

const getters = null;
const actions = {
  addNewTab({commit,tab}){
    commit(types.ADD_NEW_TAB,tab);
  }

};
const mutations = {
  [types.ADD_NEW_TAB](state , tab){
      let newTabName = ++state.tabIndex + '';
      state.push({
        title: tab.title,
        name: tab.path,
      });
      state.editableTabsValue2 = newTabName;
  }
};

export default {
  state,
  getters,
  actions,
  mutations
}
