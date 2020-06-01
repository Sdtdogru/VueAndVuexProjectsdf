<template>
    <!-- Default form login -->
    <div class="container" style="width: 50%;">
        <form>
            <label   class="grey-text">İsim</label>
            <input type="email" class="form-control"/>
            <br/>
            <label  class="grey-text">Email</label>
            <input type="email"  class="form-control"/>
            <br/>
            <label  class="grey-text">Şifre</label>
            <input type="password"   class="form-control"/>
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
        computed: {

        }
    }
</script>
