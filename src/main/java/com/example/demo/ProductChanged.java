package com.example.demo;


public class ProductChanged {
    // 정보를 충분히 전달할수있는 변수
    String eventType;
    Long productId; //상대편 corelation 키
    String productName;
    int productStock;

    public ProductChanged(){
        //이벤트명을 클래스명으로 준다
        this.eventType = this.getClass().getSimpleName();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
}
