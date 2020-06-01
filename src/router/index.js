import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Category from '../views/Category.vue'
import ProductDetails from '../views/ProductDetails.vue'
import Sepet from '../views/Sepet.vue'
import Login from '../views/login'
import Register from '../views/register'

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home
    },
    {
        path: '/about',
        name: 'About',
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
    },
    {
        path: '/category/detail/:id',
        name: 'details',
        component: ProductDetails
    },
    {
        path: '/category/:id',
        name: 'category',
        component: Category
    },
    {
        path: '/sepetim',
        name: 'sepet',
        component: Sepet
    },
    {
        path: '/login',
        name: 'login',
        component: Login
    },
    {
        path: '/register',
        name: 'register',
        component: Register
    }
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router
