<template>
    <div class="container   ">

        <p v-if="sepet.length==0">Sepette Ürün Bulunmamaktadır</p>
        <table v-else class="table">
            <thead class="thead-light">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Ürün Adı</th>
                <th scope="col">Fiyatı</th>
                <th scope="col">Özelik</th>
            </tr>
            </thead>
            <tbody v-for="den in sepet" :key="den.id">
            <tr v-for="urun in den" :key="urun.id">
                <th scope="row">{{urun.id}}</th>
                <td>{{urun.productName}}</td>
                <td>{{urun.unitPrice}}</td>
                <td>{{urun.quantityPerUnit}}</td>
            </tr>
            </tbody>
        </table>
    </div>
</template>

<script>

    import {mapState} from "vuex";

    export default {
        name: "Sepet",
        computed: {
            ...mapState(["sepet"])
        }
    }
</script>
