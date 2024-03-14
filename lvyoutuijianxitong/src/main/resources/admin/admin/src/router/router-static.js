import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import jingdian from '@/views/modules/jingdian/list'
    import jingdianCollection from '@/views/modules/jingdianCollection/list'
    import jingdianLiuyan from '@/views/modules/jingdianLiuyan/list'
    import lvyouluxian from '@/views/modules/lvyouluxian/list'
    import lvyouluxianCollection from '@/views/modules/lvyouluxianCollection/list'
    import lvyouluxianLiuyan from '@/views/modules/lvyouluxianLiuyan/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryJingdian from '@/views/modules/dictionaryJingdian/list'
    import dictionaryJingdianCollection from '@/views/modules/dictionaryJingdianCollection/list'
    import dictionaryLvyouluxian from '@/views/modules/dictionaryLvyouluxian/list'
    import dictionaryLvyouluxianCollection from '@/views/modules/dictionaryLvyouluxianCollection/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryJingdian',
        name: '景点类型',
        component: dictionaryJingdian
    }
    ,{
        path: '/dictionaryJingdianCollection',
        name: '收藏表类型',
        component: dictionaryJingdianCollection
    }
    ,{
        path: '/dictionaryLvyouluxian',
        name: '路线类型',
        component: dictionaryLvyouluxian
    }
    ,{
        path: '/dictionaryLvyouluxianCollection',
        name: '收藏表类型',
        component: dictionaryLvyouluxianCollection
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别',
        component: dictionarySex
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典表',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/jingdian',
        name: '景点信息',
        component: jingdian
      }
    ,{
        path: '/jingdianCollection',
        name: '景点收藏',
        component: jingdianCollection
      }
    ,{
        path: '/jingdianLiuyan',
        name: '景点留言',
        component: jingdianLiuyan
      }
    ,{
        path: '/lvyouluxian',
        name: '旅游路线',
        component: lvyouluxian
      }
    ,{
        path: '/lvyouluxianCollection',
        name: '路线收藏',
        component: lvyouluxianCollection
      }
    ,{
        path: '/lvyouluxianLiuyan',
        name: '路线留言',
        component: lvyouluxianLiuyan
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
