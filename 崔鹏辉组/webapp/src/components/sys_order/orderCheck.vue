<template>
	<div>
		<el-row>
			<el-col :span="24">
				<div class="grid-content bg-purple-dark totalDiv">B2C销售订单查询</div>
			</el-col>
		</el-row>
		<el-row>
			<el-col :span="24">
				<div class="grid-content bg-purple-dark bodyDiv">
					<div class="totalNav">
						<el-breadcrumb separator="/">
							<el-breadcrumb-item style="color: red;" :to="{ path: '/order' }">B2C销售管理</el-breadcrumb-item>
							<el-breadcrumb-item :to="{ path: '/order' }">B2C网店订单管理</el-breadcrumb-item>
							<el-breadcrumb-item>网店订单列表</el-breadcrumb-item>
						</el-breadcrumb>
					</div>
					<el-divider></el-divider>
					<div class="myDiv">
						<el-form ref="queryForm" :inline="true" :model="queryForm" class="demo-form-inline">
							<el-row>
								<el-col :span="8">
									<el-form-item label="订单编号:" prop="pcname" :label-width="formLabelWidth">
										<el-col :span="16">
											<el-input class="my" v-model="queryForm.pcname" placeholder="订单编号"></el-input>
										</el-col>
									</el-form-item>
								</el-col>
								<el-col :span="8" :offset="2">
									<el-form-item label="订单类型:" prop="prolevel" :label-width="formLabelWidth">
										<el-col :span="12">
											<el-select v-model="queryForm.prolevel" placeholder="全部">
												<!-- <el-option label="" value=""></el-option> -->
												<el-option v-for="pattern in patterns" :label="pattern.menuname" :value="pattern.menuname"></el-option>
											</el-select>
										</el-col>
									</el-form-item>
								</el-col>
								<el-col :span="8" :gutter="8">
									<el-form-item label="支付方式:" prop="prolevel" :label-width="formLabelWidth">
										<el-col :span="12">
											<el-select v-model="queryForm.prolevel" placeholder="全部">
												<!-- <el-option label="" value=""></el-option> -->
												<el-option v-for="pattern in patterns" :label="pattern.menuname" :value="pattern.menuname"></el-option>
											</el-select>
										</el-col>
									</el-form-item>
								</el-col>
								<el-col :span="8" :gutter="8">
									<el-form-item label="业务类型:" prop="prolevel" :label-width="formLabelWidth">
										<el-col :span="12">
											<el-select v-model="queryForm.region" placeholder="活动区域">
												<el-option label="区域一" value="shanghai"></el-option>
												<el-option label="区域二" value="beijing"></el-option>
											</el-select>
										</el-col>
									</el-form-item>
								</el-col>
							</el-row>
							<el-row>
								<el-col :span="13" style="margin-left: -10px">
									<el-form-item label="下单日期:" prop="prolevel" :label-width="formLabelWidth">
										<el-col :span="6">
											<el-input v-model="queryForm.pcname" placeholder=""></el-input>
										</el-col>
										<el-col :span="1">
											至
										</el-col>
										<el-col :span="6">
											<el-input v-model="queryForm.pcname" placeholder=""></el-input>
										</el-col>
									</el-form-item>
								</el-col>
								<el-col :span="6" :pull="5">
									<el-form-item style="margin: 0;" label="订单动作:" prop="prolevel" :label-width="formLabelWidth">
										<el-col :span="12" style="width: 100px;">
											<el-select v-model="queryForm.prolevel" placeholder="全部">
												<!-- <el-option label="" value=""></el-option> -->
												<el-option v-for="pattern in patterns" :label="pattern.menuname" :value="pattern.menuname"></el-option>
											</el-select>
										</el-col>
									</el-form-item>
								</el-col>
								<el-col :span="4" :pull="6">
									<el-form-item style="margin: 0;" label="订单状态:" prop="prolevel" :label-width="formLabelWidth">
										<el-col :span="12" style="width: 80px;">
											<el-select v-model="queryForm.prolevel" placeholder="全部">
												<!-- <el-option label="" value=""></el-option> -->
												<el-option v-for="pattern in patterns" :label="pattern.menuname" :value="pattern.menuname"></el-option>
											</el-select>
										</el-col>
									</el-form-item>
								</el-col>
								<el-col :span="4" style="margin-top: -60px;" :offset="18">
									<el-form-item>
										<el-button type="primary" size="mini" @click="querySubmit()">搜索</el-button>
										<el-button type="primary" size="mini" @click="">导入</el-button>
									</el-form-item>
								</el-col>
							</el-row>
						</el-form>
					</div>
					<hr color="#0099FF" size="1" style="z-index: 99999; margin-top: -12px; position: absolute; width: 1000px;">

					<el-table :data="tableData" @selection-change="handleSelectionChange" @current-change="currentRowChange"
					 highlight-current-row border stripe style="width: 100%">
					 
						<el-table-column type="index" width="50" label="序号">
						</el-table-column>
						<el-table-column type="selection" width="55">
						</el-table-column>
						<el-table-column prop="orderCode" label="订单编号">
						</el-table-column>
						<el-table-column prop="orderType" label="订单类型">
						</el-table-column>
						<el-table-column prop="orderAct" label="订单动作">
						</el-table-column>
						<el-table-column prop="serviceType" label="业务类型">
						</el-table-column>
						<el-table-column prop="payBy" label="支付方式">
						</el-table-column>
						<el-table-column prop="sendBy" label="配送方式">
						</el-table-column>
						<el-table-column prop="orderStatus" label="订单状态">
						</el-table-column>
						<el-table-column prop="" label="操作">
						</el-table-column>
					</el-table>

					<el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange" :page-sizes="[3, 6, 10]"
					 :page-size="pageinfo.pagesize" layout="total, sizes, prev, pager, next, jumper" :total="pageinfo.total">
					</el-pagination>
				</div>
			</el-col>
		</el-row>
		<el-row>
			<el-col :span="24">
				<div class="grid-content bg-purple-dark ">123</div>
			</el-col>
		</el-row>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				queryForm: {},
				formInline: {
					user: '',
					region: '',
				},
				pageinfo: {},
				tableData: [],
				patterns: [],
				status: [],
				formLabelWidth: '80px',
				infoFormVisible: false,
				editFormVisible: false,
				addFormVisible: false,
				currentRow: null,
				btnstatus: true,
			}
		},
		methods: {
			onSubmit() {
				console.log('submit!');
			},
			currentRowChange(val) {
				//val  当前选择的行
				this.currentRow = val;
				this.btnstatus = false;
			},
			handleSizeChange(val) {
				this.pageinfo.pagesize = val;
				this.pageinfo.page = 1;
			},
			handleCurrentChange(val) {
				this.pageinfo.page = val;
				console.log(`当前页: ${val}`);
			},
			handleSelectionChange(val) {
				this.multipleSelection = val;
			},
			// "code": 20000,
			//     "msg": "suc",
			//     "data": {
			//         "list": [
			//             {
			//                 "orderCode": 512012,
			//                 "orderType": "电话订单",
			//                 "orderAct": "订购",
			//                 "serviceType": "普通业务",
			//                 "payBy": "货到付款",
			//                 "sendBy": "EMS",
			//                 "orderStatus": "待出库",
			//                 "createTime": "2021-12-04T11:50:24",
			//                 "updateTime": "2021-12-05T11:50:28",
			//                 "remitter": "测试人",
			//                 "recipientId": 1,
			//                 "orderRemark": "无"
			//             }
			//         ],
			//         "total": 1,
			//         "pageNum": 1,
			//         "pageSize": 10
			Query() {
				this.$axios.get("/order/sysorder").then(retData => {
					debugger;
					if (retData.data.code == 20000) {
						console.log(retData)
						this.tableData = retData.data.data.list;
						this.pageinfo.pageSize = retData.data.data.pageSize;
						this.pageinfo.pageNum = retData.data.data.pageNum;
						this.pageinfo.total = retData.data.data.total;
						console.log(this.pageinfo)
					}

				});
			}
		},
		created() {
			this.Query();
		}

	}
</script>

<style scoped>
	html,
	body,
	#app {
		height: 100%;
		margin: 0;
		padding: 0;
	}

	.totalDiv {
		width: 130px;
		margin: 0;
		font-size: 14px;
		text-align: center;
		line-height: 2;
		border: aqua solid 1px;
		border-top-right-radius: 12px;
		border-top-left-radius: 12px;
		background-color: deepskyblue;

	}


	.bodyDiv {
		width: 1000px;
		height: 800px;
		border: 1px black solid;
		padding: 15px;

	}

	.el-row {
		box-sizing: border-box;
		text-align: center;

	}

	.lastinput {
		width: 80px;
	}

	.el-divider--horizontal {
		margin: 6px auto !important;
		background: 0 0;
		border-top: 1px dashed aqua;
		background-color: white !important;
		padding: 0;
		display: block;
		height: 1px;
		width: 100%;
	}

	.el-col-8 {
		width: 31.33333%;
		margin: -10px;
		margin-right: -70px;
	}

	.queryLine {
		height: 20px;
	}
</style>
<style>
	.el-breadcrumb__item:last-child .el-breadcrumb__inner,
	.el-breadcrumb__inner.is-link {
		color: red !important;
	}

	.myDiv .el-input__inner {
		height: 28px !important;

	}
</style>
