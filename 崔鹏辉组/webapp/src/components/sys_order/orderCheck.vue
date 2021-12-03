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
							<el-breadcrumb-item :to="{ path: '/order' }">B2C销售管理</el-breadcrumb-item>
							<el-breadcrumb-item :to="{ path: '/order' }">B2C网店订单管理</el-breadcrumb-item>
							<el-breadcrumb-item>网店订单列表</el-breadcrumb-item>
						</el-breadcrumb>
					</div>
					<el-divider></el-divider>
					<div class="myDiv">
						<el-form ref="queryForm" :inline="true" :model="queryForm" class="demo-form-inline">
							<el-form-item prop="pcname" label="订单编号">
								<el-input class="my" v-model="queryForm.pcname" placeholder="订单编号"></el-input>
							</el-form-item>
							<el-form-item label="订单类型" prop="prolevel" :label-width="formLabelWidth">
								<el-select v-model="queryForm.prolevel" placeholder="全部">
									<!-- <el-option label="" value=""></el-option> -->
									<el-option v-for="pattern in patterns" :label="pattern.menuname" :value="pattern.menuname"></el-option>
								</el-select>
							</el-form-item>
							<el-form-item label="支付方式" prop="prolevel" :label-width="formLabelWidth">
								<el-select v-model="queryForm.prolevel" placeholder="全部">
									<!-- <el-option label="" value=""></el-option> -->
									<el-option v-for="pattern in patterns" :label="pattern.menuname" :value="pattern.menuname"></el-option>
								</el-select>
							</el-form-item>
							<el-form-item label="业务方式" prop="prolevel" :label-width="formLabelWidth">
								<el-select v-model="queryForm.region" placeholder="活动区域">
									<el-option label="区域一" value="shanghai"></el-option>
									<el-option label="区域二" value="beijing"></el-option>
								</el-select>
							</el-form-item>
							<el-form-item label="订单状态" prop="prolevel" :label-width="formLabelWidth">
								<el-select v-model="queryForm.prolevel" placeholder="全部">
									<!-- <el-option label="" value=""></el-option> -->
									<el-option v-for="pattern in patterns" :label="pattern.menuname" :value="pattern.menuname"></el-option>
								</el-select>
							</el-form-item>

							<el-form-item prop="pcname" label="下单日期">
								<el-input v-model="queryForm.pcname" placeholder="下单日期"></el-input>
								至
								<el-input v-model="queryForm.pcname" placeholder="订单编号"></el-input>
							</el-form-item>

							<el-form-item label="商品名称">
								<el-input v-model="formInline.user" placeholder="订单编号"></el-input>
							</el-form-item>

							<el-form-item label="" prop="prostatus" :label-width="formLabelWidth">
								<el-select v-model="queryForm.prostatus" placeholder="审核状态">
									<!-- <el-option label="" value="0"></el-option> -->
									<el-option v-for="status in status" :label="status.menuname" :value="status.menuid"></el-option>
								</el-select>
							</el-form-item>
							<el-form-item>
								<el-button type="primary" @click="querySubmit()">查询</el-button>
								<el-button @click="resetForm('queryForm')">重置</el-button>
							</el-form-item>
							</el-form-item>
						</el-form>
					</div>

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
				formLabelWidth: '120px',
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
			}
		}
	}
</script>

<style scoped>
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
		padding: 12px;
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
	.queryLine {
		height: 20px;
	}
	.my{
		height: 10px;
	}

	.el-breadcrumb__item:last-child .el-breadcrumb__inner,
	.el-breadcrumb__inner.is-link {
		color: red !important;
	}

	input.el-input__inner {
	    height: 26px !important;
	}
</style>
