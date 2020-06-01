<template>
    <div class="home">

        <helloWorld :products="movies"/>

    </div>
</template>

<script>
    // @ is an alias to /src
    import HelloWorld from '@/components/HelloWorld.vue'
    import {mapState} from "vuex";

    export default {
        name: 'Home',
        components: {
            HelloWorld
        },
        data() {
            return {

                isloading: true
            }

        },
        props: {},
        created() {
            this.$store.dispatch('getProduct').then(() =>
                this.isloading = false
            )
        },
        computed: {
            ...mapState(["movies"])
        },
        methods: {}

    }
</script>
