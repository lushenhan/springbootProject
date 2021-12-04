<template>
    <el-container class="body">
        <el-header>
            <div class="index_head">
                <img src="../../assets/myLogo.png" id="logo"/>
                <div class="index_title">
                    <div class="cntitle">
                        电子商务进销存系统
                    </div>
                    <div class="entitle">
                        Electronic business invoicing system
                    </div>
                </div>
            </div>
        </el-header>
        <el-container>
            <el-aside width="200px">
                <!--                <div class="aside_title">-->

                <!--                </div>-->
                <!--                <div class="aside_body">-->

                <!--                </div>-->
                <el-col :span="22">

                    <el-menu
                            router
                            default-active="1-1"
                            class="el-menu-vertical-demo"
                            @open="handleOpen"
                            @close="handleClose">
                        <el-submenu index="">
                            <template slot="title">
                                <i class="el-icon-location"></i>
                                <span>商品管理</span>
                            </template>
                            <el-menu-item-group>
                                <router-link to="/product" @click="gorouter"><el-menu-item index="" >产品查询</el-menu-item></router-link>
                                <router-link to="/goods"><el-menu-item index="">商品管理</el-menu-item></router-link>
                                <el-menu-item index="">商品品牌管理</el-menu-item>
                                <el-menu-item index="">商品类型管理</el-menu-item>
                                <el-menu-item index="">供应商管理</el-menu-item>
                                <el-menu-item index="">价格调整管理</el-menu-item>
                                <el-menu-item index="">价格调整审核</el-menu-item>
                            </el-menu-item-group>
                        </el-submenu>
                    </el-menu>

                </el-col>
            </el-aside>
            <el-main>
                <div id="mymain">
                    <router-view></router-view>
                </div>
            </el-main>
        </el-container>
        <el-footer>footer</el-footer>
    </el-container>
</template>

<script>
    export default {
        methods: {
            handleOpen(key, keyPath) {
                console.log(key, keyPath);
            },
            handleClose(key, keyPath) {
                console.log(key, keyPath);
            },
            gorouter(){

            }
        }
    }
</script>
<style scoped>
    .el-header {
        background-color: #c2e0ff;
        color: #333;
        text-align: center;
        line-height: 60px;
    }

    .body {
        height: 100%;
    }

    .el-footer {
        margin-top: 20px;
        background-color: #e4e4e4;
        color: #333;
    }

    .el-aside {
        background-color: #e4e4e4;
        margin-right: 0.3%;
        margin-top: 10px;
        width: 99.7%;
        color: #333;
        text-align: center;
        height: 60%;
        line-height: 20px;
    }

    .el-main {
        background-color: #fff;
        color: #333;
        height: 100%;
        text-align: center;
        line-height: 20px;
        margin-top: 10px;
        padding: 0 !important;
    }

    body > .el-container {
        margin-bottom: 40px;
    }

    .el-container:nth-child(5) .el-aside,
    .el-container:nth-child(6) .el-aside {
        line-height: 260px;
    }

    .el-container:nth-child(7) .el-aside {
        line-height: 320px;
    }
    a{
        text-decoration: none;
        color: #000000;
    }
    .aside_title {
        /*background-color: #e4e4e4;*/
        /*height: 5%;*/
        height: 60px !important;
        margin: 0 !important;
        padding: 0 !important;
        /*border: 1px solid #000;*/
        /*margin-bottom: 2px;*/
    }

    /*.aside_body {*/
    /*    background-color: #e4e4e4;*/
    /*    height: 94%;*/

    /*    border: 1px solid #000;*/
    /*}*/
    .el-submenu__title {
        width: 100% !important;
    }

    el-menu-vertical-demo el-menu {
        border: 0 !important;
        margin-top: 1px !important;
    }
    #mymain{
        width: 100%;
        height: 100% !important;
        margin: 0;
        padding: 0 !important;
    }
    .el-col * {
        background-color: #e4e4e4 !important;
    }
    .el-menu-item:focus{
        background-color: #c2e0ff !important;
    }
    .el-menu-item.is-active {
        /*color: green !important;*/
        background-color: #c2e0ff !important;
    }

    .el-submenu__title.is-active {
        /*color: green !important;*/
        background-color: #c2e0ff !important;
    }

    .el-menu-item:hover {
        background-color: #c2e0ff !important;
    }
.index_head{
    text-align: left;
}
.index_title{
    width: 300px;
    height: 60px;
    /*border: 1px solid #000;*/
    float: left;
    position: relative;
    padding-left: 20px;
}
    .cntitle{
        float: left;
        line-height: 55px;
        font-size: 18px;
        font-weight: bold;
        height: 50px;
    }
    .entitle{
        float: left;
        font-size: 10px;
        height: 20px;
        line-height: 0px;
    }
    #logo{
        margin-top: 5px;
        float: left;
    }
    html, body {
        height: 100%;
    }

    * {
        margin: 0;
    }
</style>