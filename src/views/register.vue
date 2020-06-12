<template>
    <!-- Default form login -->
    <div class="container" style="width: 50%;">
        <form @submit="addUser">
            <label class="grey-text">İsim</label>
            <input type="text" name="name" class="form-control" v-model="user.name" id="name"/>
            <br/>
            <label class="grey-text">Email</label>
            <input type="email" name="email" class="form-control" v-model="user.email" id="email"/>
            <br/>
            <label class="grey-text">Şifre</label>
            <input type="password" name="password" class="form-control" v-model="user.password"  id="password"/>
            <div class="text-center mt-4">
                <button class="btn btn-indigo btn-success" type="submit">Kaydet</button>
            </div>
        </form>
    </div>
    <!-- Default form login -->
</template>

<script>

    import {mapState} from "vuex";

    export default {
        name: "Login",
        computed: {},
        data(){
            return{
                user:{name:"",email:"",password:""}
            }
        },
        methods: {
          async  addUser() {
                fetch(`http://localhost:4000/user`,{
                    method:'POST',
                    body:JSON.stringify(this.user),
                    headers:{"Content-Type":"application/json"}
                }).then((reset) => {alert("Başarıyla Kayıt oldunuz");  });
              this.$router.push('login');
            }
            }

    }
</script>
