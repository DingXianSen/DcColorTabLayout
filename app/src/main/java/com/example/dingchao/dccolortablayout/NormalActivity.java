package com.example.dingchao.dccolortablayout;

public class NormalActivity extends BaseActivity {


    @Override
    protected void loadViewLayout() {
        setContentView(R.layout.activity_normal);
        setTitle("NormalActivity");
    }

    @Override
    protected void initTab() {
        titles = new String[]{"全部", "未付款", "已付款", "已退款"};
        super.initTab();
    }
}
