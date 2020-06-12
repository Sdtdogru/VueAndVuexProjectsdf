<template>
    <!-- Default form login -->
    <div class="container" style="width: 50%;">
    <form @submit="login()">

        <label for="defaultFormLoginEmailEx" class="grey-text" >Email</label>
        <input type="email" id="defaultFormLoginEmailEx" class="form-control" v-model="email" />
        <br/>
        <label for="defaultFormLoginPasswordEx" class="grey-text">Şifre</label>
        <input type="password" id="defaultFormLoginPasswordEx" class="form-control"/>
        <div class="text-center mt-4">
            <button class="btn btn-indigo btn-success" type="submit" style="margin-right: 4px" >Giriş</button>
            <router-link class="btn btn-indigo btn-success"  :to="{path:'/register'}">kayıt Ol</router-link>
        </div>
    </form>
    </div>
    <!-- Default form login -->
</template>

<script>

    import {mapState} from "vuex";

    export default {
        name: "Login",
        computed: {

        },   data(){
            return{
                email:""
            }
        },
        methods:{
            async  login(){
                this.$store.dispatch('login', this.email).then(() => {
                    this.$router.push('/')
                })
            }


        }
    }
</script>
