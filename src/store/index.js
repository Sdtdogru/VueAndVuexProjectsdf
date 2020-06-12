import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        sedat: "kullaılar yöntem state",
        movies: [],
        category: [],
        detail: {},
        sepet: [],
        user:[]

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
            state.sepet.push(ekle);
        },
        login(state,user){
            localStorage.setItem('user', JSON.stringify(user));
        }
    },
    actions: {
        async getProduct(context) {
            fetch('http://localhost:4000x"/products')
                .then((res) => {
                    return res.json()
                })
                .then((res) => {
                    context.commit('getProductt', res)

                })
        },
        getCategory(context, id) {
            fetch(`https://fab45a714a9c.ngrok.io/products?categoryId=${id}`)
                .then((res) => {
                    return res.json()
                })
                .then((res) => {
                    context.commit('getcategory', res)

                })
        },
        getDetail(context, id) {
            fetch(`https://fab45a714a9c.ngrok.io/products?id=${id}`)
                .then((res) => {
                    return res.json()
                })
                .then((res) => {
                    context.commit('getDetail', res)

                })
        },
        arttir(context, id) {
            fetch(`https://fab45a714a9c.ngrok.io/products?id=${id}`)
                .then((res) => {
                    return res.json()
                })
                .then((res) => {
                    context.commit('arttir', res)

                })
        },
       async userAdd(user){
            fetch(`https://fab45a714a9c.ngrok.io/user`,{
                method:'POST',
                body:JSON.stringify(user),
               headers:{"Content-Type":"application/json"}
            }).then(reset => alert(reset))
        },
        async login(context,email){
            fetch(`https://fab45a714a9c.ngrok.io/user/${email}`)
                .then((res) => {
                    return res.json()

                })
                .then((res) => {
                    context.commit('login', res)

                })
        }
    },
    modules: {},
    getters: {}
})
