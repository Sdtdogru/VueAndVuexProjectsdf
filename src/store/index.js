import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        sedat: "kullaılar yöntem state",
        movies: [],
        category: [],
        detail: {},
        sepet: []

    },
    mutations: {
        getProductt(state, movies) {
            state.movies = movies
        },
        getcategory(state, category) {
            state.category = category
        },
        getDetail(state, detail) {
            state.detail = detail

        },
        arttir(state, ekle) {
            state.sepet.push(ekle)
        }
    },
    actions: {
        async getProduct(context) {
            fetch('http://localhost:3000/products')
                .then((res) => {
                    return res.json()
                })
                .then((res) => {
                    context.commit('getProductt', res)

                })
        },
        getCategory(context, id) {
            fetch(`http://localhost:3000/products?categoryId=${id}`)
                .then((res) => {
                    return res.json()
                })
                .then((res) => {
                    context.commit('getcategory', res)

                })
        },
        getDetail(context, id) {
            fetch(`http://localhost:3000/products?id=${id}`)
                .then((res) => {
                    return res.json()
                })
                .then((res) => {
                    context.commit('getDetail', res)

                })
        },
        arttir(context, id) {
            fetch(`http://localhost:3000/products?id=${id}`)
                .then((res) => {
                    return res.json()
                })
                .then((res) => {
                    context.commit('arttir', res)

                })
        }
    },
    modules: {},
    getters: {}
})
