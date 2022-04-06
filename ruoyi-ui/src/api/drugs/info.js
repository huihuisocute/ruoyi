import request from '@/utils/request'

// 查询药品管理列表
export function listInfo(query) {
  return request({
    url: '/drugs/info/list',
    method: 'get',
    params: query
  })
}

// 查询药品管理详细
export function getInfo(id) {
  return request({
    url: '/drugs/info/' + id,
    method: 'get'
  })
}

// 新增药品管理
export function addInfo(data) {
  return request({
    url: '/drugs/info',
    method: 'post',
    data: data
  })
}

// 修改药品管理
export function updateInfo(data) {
  return request({
    url: '/drugs/info',
    method: 'put',
    data: data
  })
}

// 删除药品管理
export function delInfo(id) {
  return request({
    url: '/drugs/info/' + id,
    method: 'delete'
  })
}

// 导出药品管理
export function exportInfo(query) {
  return request({
    url: '/drugs/info/export',
    method: 'get',
    params: query
  })
}