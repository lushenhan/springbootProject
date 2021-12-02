import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import index from '../components/commodityManagement/index'
import product  from "../components/commodityManagement/children/product";
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/index',
    name: 'index',
    component: index,
    children:[
      {
        path:'/product',
        name:'product',
        component:product
      }
    ]
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
