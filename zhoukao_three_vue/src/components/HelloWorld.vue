<template>
  <el-main>
    <el-table
      ref="multipleTable"
      :data="tableData"
      tooltip-effect="dark"
      style="width: 100%"
      @selection-change="handleSelectionChange">
      <el-table-column
        type="selection"
        width="55">
      </el-table-column>
      <el-table-column
        prop="descs"
        label="描述"
        width="120">
      </el-table-column>
      <el-table-column
        prop="hetong_id"
        label="合同编号"
        width="120">
      </el-table-column>
      <el-table-column
        prop="hetong_price"
        label="合同价格"
        width="120">
      </el-table-column>
      <el-table-column
        prop="huikuan_price"
        label="回款价格"
        width="120">
      </el-table-column>
      <el-table-column
        prop="yukuan_id"
        label="回款ID"
        width="120">
      </el-table-column>
      <el-table-column
        prop="yukuan_price"
        label="余款价格"
        width="120">
      </el-table-column>
      <el-table-column
        prop="yukuan_time"
        label="余款时间"
        width="120">
      </el-table-column>
      <el-table-column
        prop="name"
        label="名字 "
        show-overflow-tooltip>
      </el-table-column>
      <el-table-column
        fixed="right"
        label="操作"
        width="100">
        <template slot-scope="scope">
          <el-button @click="deletes(scope.row.yukuan_id)" type="text" size="small">删除</el-button>
          <el-button type="text" size="small">编辑</el-button>
        </template>
      </el-table-column>
    </el-table>
    <div style="margin-top: 20px">
      <el-button @click="toggleSelection([tableData[1], tableData[2]])">切换第二、第三行的选中状态</el-button>
      <el-button @click="bechAll()">批量删除</el-button>
    </div>
  </el-main>
</template>

<script>
  const axios = require("axios")
  let baseUrl = "http://10.31.47.36:8082/hetong/"
  export default {
    name: 'HelloWorld',
    data() {
      return {
        tableData: [],
        ids: '',
        multipleSelection: []
      }
    },

    methods: {
      bechAll() {
        let self = this;
        if (this.ids != '') {
        } else {
          this.$message("请你选择编号")
          return;
        }
        console.log(this.ids)
        axios({
          url: baseUrl + "deletes",
          method: "get",
          params: {ids: this.ids}
        }).then(function (response) {
          console.log(response)
          if (response.data) {
            self.getList();
          }
        })
      },
      getList() {
        let self = this;
        axios({
          url: baseUrl + "list",
          method: "get",
          params: ""
        }).then(function (response) {
          console.log(response)
          self.tableData = response.data[0].huiKuans
        })
      },
      toggleSelection(rows) {
        if (rows) {
          rows.forEach(row => {
            this.$refs.multipleTable.toggleRowSelection(row);
          });
        } else {
          this.$refs.multipleTable.clearSelection();
        }
      },
      deletes(ids) {
        let self = this;
        if (ids != '') {
        } else {
          this.$message("请你选择编号")
          return;
        }
        axios({
          url: baseUrl + "deletes",
          method: "get",
          params: {ids: ids}
        }).then(function (response) {
          console.log(response)
          if (response.data) {
            self.getList();
          }
        })
      },
      handleSelectionChange(val) {
        let self = this;
        let ids = '';
        for (var i = 0; i < val.length; i++) {
          if (ids != '') {
            ids += "," + val[i].yukuan_id
          } else {
            ids += val[i].yukuan_id
          }
        }
        self.ids = ids
        this.multipleSelection = val;
      }
    },
    created() {
      this.getList();
    }

  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
