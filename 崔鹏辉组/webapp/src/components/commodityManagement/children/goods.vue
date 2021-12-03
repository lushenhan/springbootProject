<template>
    <el-container class="product_container">
        <el-header class="product_header">
            <div class="header_title">
                <div class="title_text">商品管理</div>
            </div>
        </el-header>
        <el-main class="product_main">
            <div class="main_title">
                商品与赠品管理-->商品管理-->商品信息列表
            </div>
            <el-form :inline="true" class="product_form" >
                <el-form-item label="商品名称" label-width="60">
                    <el-input v-model="prodForm.prodCode" placeholder="请输入商品名称" class="elInput"></el-input>
                </el-form-item>
                <el-form-item label="商品型号" label-width="60">
                    <el-input v-model="prodForm.prodType" placeholder="请输入商品型号:" class="elInput"></el-input>
                </el-form-item>
                <el-form-item label="商品颜色" label-width="60">
                    <el-select v-model="prodForm.prodColor" placeholder="全部" class="elInput">
                        <el-option
                                v-for="item in options"
                                :key="item.value"
                                :label="item.label"
                                :value="item.value">
                        </el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="商品品牌" label-width="60">
                    <el-select v-model="value" placeholder="全部"  class="elInput">
                        <el-option
                                v-for="item in options"
                                :key="item.value"
                                :label="item.label"
                                :value="item.value">
                        </el-option>
                    </el-select>
                </el-form-item>
                <el-form-item label="商品分类" label-width="60" >
                    <el-select v-model="value" placeholder="全部" class="elInput">
                        <el-option
                                v-for="item in options"
                                :key="item.value"
                                :label="item.label"
                                :value="item.value">
                        </el-option>
                    </el-select>
                </el-form-item>
                <el-button type="primary" @click="submit">搜索</el-button>
                <el-button type="primary" @click="clearForm">清空</el-button>
                <el-button type="primary" @click="submit">创建一类商品</el-button>
                <el-button type="primary" @click="submit">创建二类商品</el-button>
            </el-form>
            <el-table
                    ref="product_table"
                    @current-change="handleCurrentChange"
                    :row-class-name="tableRowClassName"
                    :data="products"
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
                        prop="prodCode"
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
                        prop="prodType"
                        align="center"
                        width="240"
                        label="商品型号">
                </el-table-column>
                <el-table-column
                        prop="prodColor"
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
                prodForm: {
                    categoryId: '',
                    categoryName: '',
                    prodCode: '',
                    brandId: '',
                    brandName: '',
                    prodType: '',
                    prodColor: '',
                },
                pagesize:5,
                total:10,
                currentPage: 1,
                options: [{
                    value: '选项1',
                    label: '黄金糕'
                }, {
                    value: '选项2',
                    label: '双皮奶'
                }, {
                    value: '选项3',
                    label: '蚵仔煎'
                }, {
                    value: '选项4',
                    label: '龙须面'
                }, {
                    value: '选项5',
                    label: '北京烤鸭'
                }],
                value: '',
                products: []
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
                this.$refs.product_table.setCurrentRow(row);
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
                this.$axios.get("commodityManagement/product?pageSize="+this.pagesize+"&pageNum="+this.currentPage).then(response => {
                    this.products = response.data.list;
                    this.total = response.data.total;
                })
            },
            clearForm(){
                this.prodForm = {}
            },
            submit(){
                var param = this.$qs.stringify(this.prodForm);
                console.log(param);
                this.$axios.get("commodityManagement/product?"+param,).then(response=>{
                    this.products = response.data.list;
                })
            }
        },
        mounted() {
            this.getAllProd();
        }
    }

</script>

<style scoped>
    .product_header {
        background-color: #B3C0D1;
        color: #333;
        text-align: center;
        padding: 0 !important;
        height: 25px !important;
        width: 100%;
    }


    .product_main {
        background-color: #fff;
        color: #333;
        text-align: center;
        padding: 5px !important;
        border: 1px solid #000;
        width: 100%;
        height: 80%;
        line-height: 20px !important;
    }

    .product_container {
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
        text-align: left;
        border-bottom: 1px solid #0099ff;
    }

    .product_form {
        margin-top: 20px;
        /*height:auto !important;*/
        padding-left: 20px;

    }

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
    .elInput{
        width: 150px !important;
    }
    .table_button{
        width: 60px !important;
        height: 30px;
        padding-right: 20px !important;
        line-height: 10px !important;
        /*text-align: left !important;*/
    }
    .el-form-item{
        text-align: center !important;
    }


</style>