<script src="../../../plugins/element.js"></script>
<template>
    <el-container class="goods_container">
        <el-header class="goods_header">
            <div class="header_title">
                <div class="title_text">商品管理</div>
            </div>
        </el-header>
        <el-main class="goods_main">
            <div class="main_title">
                商品与赠品管理-->商品管理-->商品信息列表
            </div>
            <el-form :inline="true" class="goods_form">
                <el-form-item label="商品名称" label-width="60">
                    <el-input v-model="gdsForm.goodsName" placeholder="请输入商品名称" class="elInput"></el-input>
                </el-form-item>
                <el-form-item label="商品型号" label-width="60">
                    <el-input v-model="gdsForm.type" placeholder="请输入商品型号:" class="elInput"></el-input>
                </el-form-item>
                <el-form-item label="商品颜色" label-width="60">
                    <el-select v-model="gdsForm.color" placeholder="全部" class="elInput">
                        <el-option
                                v-for="color in colors"
                                :key="color.dictionaryDatasId"
                                :label="color.dictionaryDatasName"
                                :value="color.dictionaryDatasName">
                        </el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="商品品牌" label-width="60">
                    <el-select v-model="gdsForm.brandId" placeholder="全部" class="elInput">
                        <el-option
                                v-for="brand in brands"
                                :key="brand.dictionaryDatasId"
                                :label="brand.dictionaryDatasName"
                                :value="brand.entityId">
                        </el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="商品分类" label-width="60">
                    <el-select v-model="gdsForm.categoryId" placeholder="全部" class="elInput">
                        <el-option
                                v-for="category in categorys"
                                :key="category.dictionaryDatasId"
                                :label="category.dictionaryDatasName"
                                :value="category.entityId">
                        </el-option>
                    </el-select>
                </el-form-item>
                <el-button type="primary" @click="submit">搜索</el-button>
                <el-button type="primary" @click="clearForm">清空</el-button>
                <el-button type="primary" @click="createOne = true">创建一类商品</el-button>
                <el-button type="primary" @click="createTwo = true">创建二类商品</el-button>
            </el-form>
            <el-table
                    ref="goods_table"
                    @current-change="handleCurrentChange"
                    :row-class-name="tableRowClassName"
                    :data="goods_list"
                    height="600"
                    border
                    style="width: 100%">
                <el-table-column
                        type="index"
                        label="序号"
                        width="90"
                        align="center"
                        :index="indexMethod">
                </el-table-column>
                <el-table-column
                        prop="goodsName"
                        width="180"
                        align="center"
                        label="商品名称"
                >
                </el-table-column>
                <el-table-column
                        prop="categoryName"
                        align="center"
                        width="180"
                        label="商品分类"
                >
                </el-table-column>
                <el-table-column
                        prop="brandName"
                        align="center"
                        width="240"
                        label="商品品牌">
                </el-table-column>
                <el-table-column
                        prop="type"
                        align="center"
                        width="240"
                        label="商品型号">
                </el-table-column>
                <el-table-column
                        prop="color"
                        align="center"
                        width="180"
                        label="商品颜色">
                </el-table-column>
                <el-table-column
                        align="center"
                        width="240"
                        label="操作" class="table_buttons">
                    <el-button type="primary" class="table_button">查看</el-button>
                    <el-button type="warning" class="table_button">修改</el-button>
                    <el-button type="danger" class="table_button">删除</el-button>
                </el-table-column>
            </el-table>

            <el-dialog title="创建一类商品" :visible.sync="createOne" class="mydialog">
                <el-form ref="form" :model="sizeForm" label-width="250px" size="middle" class="create_form">
                    <el-form-item label="存货档案编码:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="基础库-分类:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="基础库品牌::">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="基础库-型号:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="基础库-颜色:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="基础库-采购模式:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="基础库-铺货:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="基础库-备机:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="基础库-铺货:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="商品名称:">
                        <el-select v-model="form.region" placeholder="请选择活动区域">
                            <el-option label="区域一" value="shanghai"></el-option>
                            <el-option label="区域二" value="beijing"></el-option>
                        </el-select>
                    </el-form-item>
                    <el-form-item label="商品类别:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="采购价:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="市场价:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="商城价:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="最低库存量:">
                        <el-input v-model="sizeForm.name" disabled></el-input>
                    </el-form-item>
                    <el-form-item label="是否可采购:">
                        <el-select v-model="form.region" placeholder="请选择活动区域">
                            <el-option label="不可采购" value="0"></el-option>
                            <el-option label="可采购" value="1"></el-option>
                        </el-select>
                    </el-form-item>
                </el-form>
            </el-dialog>
            <el-dialog title="收货地址" :visible.sync="create">
            </el-dialog>
            <div class="block">
                <el-pagination
                        @current-change="handleCurrentPage"
                        @size-change="handleSizeChange"
                        :current-page="currentPage"
                        :page-sizes="[5, 10, 20, 30]"
                        :page-size="pagesize"
                        layout="total, sizes, prev, pager, next, jumper"
                        :total="total">
                </el-pagination>
            </div>
        </el-main>
    </el-container>
</template>

<script>
    export default {
        data() {
            return {
                gdsForm: {
                    categoryId: '',
                    // categoryName: '',
                    goodsName: '',
                    brandName: '',
                    type: '',
                    color: '',
                },
                pagesize: 5,
                total: 10,
                currentPage: 1,
                colors: [],
                value: '',
                goods_list: [],
                categorys: [],
                brands: [],
                gridData: [{
                    date: '2016-05-02',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1518 弄'
                }, {
                    date: '2016-05-04',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1518 弄'
                }, {
                    date: '2016-05-01',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1518 弄'
                }, {
                    date: '2016-05-03',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1518 弄'
                }],
                createOne: false,
                createTwo: false,
                form: {
                    name: '',
                    region: '',
                    date1: '',
                    date2: '',
                    delivery: false,
                    type: [],
                    resource: '',
                    desc: ''
                },
                sizeForm: {
                    name: '',
                    region: '',
                    date1: '',
                    date2: '',
                    delivery: false,
                    type: [],
                    resource: '',
                    desc: ''
                },
                formLabelWidth: '120px'
            }

        },
        methods: {
            handleSizeChange(val) {
                this.pagesize = val;
                this.getAllProd();
                console.log(`每页 ${val} 条`);
            },
            handleCurrentPage(val) {
                this.currentPage = val;
                this.getAllProd();
                console.log(`当前页: ${val}`);
            },
            indexMethod(index) {
                return index + 1;
            },
            setCurrent(row) {
                this.$refs.goods_table.setCurrentRow(row);
            },
            handleCurrentChange(val) {
                this.currentRow = val;
            },
            tableRowClassName({row, rowIndex}) {
                if ((rowIndex + 1) % 2 === 0) {
                    return 'success-row';
                }
                return '';
            },
            getAllProd() {
                this.$axios.get("commodityManagement/goods?pageSize=" + this.pagesize + "&pageNum=" + this.currentPage).then(response => {
                    this.goods_list = response.data.list;
                    this.total = response.data.total;
                })
            },
            getOption() {
                this.$axios.get("sys/dictionarydatas/byDid?did=1").then(response => {
                    this.colors = response.data.data;
                })
                this.$axios.get("sys/dictionarydatas/byDid?did=2").then(response => {
                    this.brands = response.data.data;
                })
                this.$axios.get("sys/dictionarydatas/byDid?did=3").then(response => {
                    this.categorys = response.data.data;
                })
            },
            clearForm() {
                this.gdsForm = {}
            },
            onSubmit() {
                console.log('submit!');
            },
            submit() {
                var param = this.$qs.stringify(this.gdsForm);
                console.log(param);
                this.$axios.get("commodityManagement/goods?" + param).then(response => {
                    this.goods_list = response.data.list;
                })
            }
        },
        mounted() {
            this.getAllProd();
            this.getOption();
        }
    }

</script>

<style>
    .goods_header {
        background-color: #B3C0D1;
        color: #333;
        text-align: center;
        padding: 0 !important;
        height: 25px !important;
        width: 100%;
    }


    .goods_main {
        background-color: #fff;
        color: #333;
        text-align: center;
        padding: 5px !important;
        border: 1px solid #000;
        width: 100%;
        height: 80%;
        line-height: 20px !important;
    }

    .goods_container {
        height: 100% !important;
        width: 100% !important;
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

    .header_title {
        height: 25px;
        width: 100%;
        margin: 0;
        background-color: #fff;
    }

    .title_text {
        width: 100px;
        height: 24px;
        background-color: #66ccff;
        border-top-left-radius: 5px;
        border-top-right-radius: 5px;
        line-height: 24px;
        font-size: 15px;
    }

    .main_title {
        width: 99%;
        height: 24px;
        line-height: 20px;
        font-size: 15px;
        text-align: left;
        color: #ff0000;
        padding-left: 10px;
        border-bottom: 1px #0099ff dashed;
        background-color: #fff;
    }

    .main_input {
        width: 100%;
        /*height: 100px;*/


    }

    /*.el-input {*/
    /*    width: 150px !important;*/
    /*    height: 40px;*/
    /*}*/

    .el-form-item {
        line-height: 20px;
    }

    .el-form, .el-form--inline {
        height: 60px !important;
    }

    .el-form {

    }
    .el-input{
        width: 300px;
    }
    .goods_form {
        margin-top: 20px;
        /*height:auto !important;*/
        padding-left: 20px;
        text-align: left;
        border-bottom: 1px solid #0099ff;

    }
    /*/deep/.el-form-item__content{*/
    /*    width:150px !important;*/
    /*}*/
    .create_form{
        padding-top: 20px;
        height: 600px !important;
        width: 800px !important;
       margin: 10px auto;
        border: 1px dashed slategray;
        overflow-x: hidden!important;
    }
    /*.el-form-item__content{*/
    /*    width: 500px !important;*/
    /*}*/
    .create_form .el-input__inner{
        width: 300px!important;
    }
   /*.create_form .el-form-item{*/
   /*    border: 1px solid #0099ff !important;*/
   /* }*/
   /*.create_form  .el-form-item__label{*/
   /*     !*border-right: 1px solid #0099ff !important;*!*/
   /*    width: 200px !important;*/
   /* }*/
    .el-table {
        color: #000 !important;
        margin-top: 5px;
        padding-left: 100px;
        border: none !important;
    }

    .el-table .success-row {
        background: #e4e4e4;

    }

    .el-table th.el-table__cell {
        background: #d7d7d7 !important;
        color: #000000 !important;
    }

    .elInput {
        width: 150px !important;
    }

    .table_button {
        width: 60px !important;
        height: 30px;
        padding-right: 20px !important;
        line-height: 10px !important;
        /*text-align: left !important;*/
    }
    /deep/.mydialog{
        text-align: center !important;
    }
    .el-form-item {
        text-align: center !important;
    }

    /deep/.el-scrollbar__wrap {
        overflow-x: hidden!important;
    }


</style>