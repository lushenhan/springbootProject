<template>
    <el-container class="body">
        <el-header>Header</el-header>
        <el-container>
            <el-aside width="200px">
                <!--                <div class="aside_title">-->

                <!--                </div>-->
                <!--                <div class="aside_body">-->

                <!--                </div>-->
                <el-col :span="22">

                    <el-menu
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
                                <el-menu-item index="1-1">产品查询</el-menu-item>
                                <el-menu-item index="1-2">商品管理</el-menu-item>
                                <el-menu-item index="1-3">商品品牌管理</el-menu-item>
                                <el-menu-item index="1-4">商品类型管理</el-menu-item>
                                <el-menu-item index="1-5">供应商管理</el-menu-item>
                                <el-menu-item index="1-5">价格调整管理</el-menu-item>
                                <el-menu-item index="1-5">价格调整审核</el-menu-item>
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
            }
        }
    }
</script>
<style>
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
        background-color: #e4e4e4;
        color: #333;
        text-align: center;
        line-height: 60px;
    }

    .el-aside {
        background-color: #e4e4e4;
        margin-right: 0.3%;
        width: 99.7%;
        color: #333;
        text-align: center;
        height: 100%;
        line-height: 200px;
    }

    .el-main {
        background-color: #E9EEF3;
        color: #333;
        height: 100%;
        text-align: center;
        line-height: 160px;
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

    .el-col * {
        background-color: #e4e4e4 !important;
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

    html, body {
        height: 100%;
    }

    * {
        margin: 0;
    }
</style>