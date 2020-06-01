<template>
    <div class="home">

        <helloWorld :products="products"/>

    </div>
</template>

<script>
    // @ is an alias to /src
    import HelloWorld from '@/components/HelloWorld.vue'


    export default {
        name: 'Abaut',
        components: {
            HelloWorld
        },
        data() {
            return {
                products: [
                    {
                        "id": 1,
                        "categoryId": 2,
                        "productName": "Chai",
                        "quantityPerUnit": "48 - 6 oz jars",
                        "unitPrice": "24",
                        "unitsInStock": 53
                    },
                    {
                        "id": 2,
                        "categoryId": 1,
                        "productName": "Chang",
                        "quantityPerUnit": "24 - 12 oz bottles",
                        "unitPrice": "21",
                        "unitsInStock": 17
                    },
                    {
                        "id": 4,
                        "categoryId": 1,
                        "productName": "Chef Anton's Cajun Seasoning",
                        "quantityPerUnit": "48 - 6 oz jars",
                        "unitPrice": "222",
                        "unitsInStock": 53
                    },
                    {
                        "id": 5,
                        "categoryId": 2,
                        "productName": "Chef Anton's Gumbo Mix",
                        "quantityPerUnit": "36 boxes",
                        "unitPrice": "21",
                        "unitsInStock": 0
                    }
                ]
            }
        }
    }
</script>
