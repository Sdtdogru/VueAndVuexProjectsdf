<template>
    <div class="Category">

        <helloWorld :products="category"/>
    </div>
</template>

<script>
    // @ is an alias to /src
    import HelloWorld from '@/components/HelloWorld.vue'
    import {mapState} from "vuex";

    export default {
        name: 'Category',
        components: {
            HelloWorld
        },
        data() {
            return {}
        },
        created() {
            this.fetchData()
        },

        computed: {
            ...mapState(["category"])
        },
        methods: {
            fetchData() {
                const categoryId = this.$route.params.id;
                this.$store.dispatch('getCategory', categoryId).then(() => {
                    console.log(this.category)
                })
            }
        },
        watch: {
            '$route': 'fetchData'
        }
    }
</script>
