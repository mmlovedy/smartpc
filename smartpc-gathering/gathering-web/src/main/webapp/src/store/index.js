import Vue from 'vue'
import Vuex from 'vuex'
import actions from './actions'
import getters from './getters'
import content from './modules/homepage/content'
import app from './modules/homepage/app'


Vue.use(Vuex)

const debug = process.env.NODE_ENV !== 'production'

export default new Vuex.Store({
  actions,
  getters,
  modules: {
    content,
    app
  },
  strict: debug
})
