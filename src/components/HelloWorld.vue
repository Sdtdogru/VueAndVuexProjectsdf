<template>
  <div class="hello container">


    <section id="outline-variants">
      <p v-if="products.length==0 ">Ürun Listesi Boş</p>
      <div v-else class="row text-left" matchHeight="card " style="padding-top: 12px;">

        <div class="col-md-6 col-sm-12" v-for="product in products" :key="product.id" style="padding-top: 12px;" >
          <div class="card card-outline-info box-shadow-0 text-center">
            <div class="card-content">
              <div class="card-body pt-3">
                <div class="row d-flex">
                  <div class="col align-self-center">
                    <img src="../assets/01.png" alt="element 04" width="210" class="float-left mt-3">
                  </div>
                  <div class="col align-self-center">
                    <h4 class="card-title mt-3">{{product.productName}}</h4>
                    <p class="card-text">{{product.quantityPerUnit}}</p>
                    <span class="currency"></span><span class="num">{{product.unitPrice}} ₺</span><br><br>

                    <router-link class="btn btn-raised btn-info btn-darken-3" :to="{path : 'detail/' + product.id}">Detaylar</router-link>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>

      </div>
    </section>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {

    products:Array,

  },
  computed:{

  },
  methods:{

}
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
