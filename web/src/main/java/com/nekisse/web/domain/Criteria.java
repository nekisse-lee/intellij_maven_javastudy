package com.nekisse.web.domain;


public class Criteria {
    private int page;
    private int perPageNum;

    public Criteria() {
        this.page = 1;
        this.perPageNum = 10;
    }

    public void setPage(int page) {
        if (page <= 0) {
            page = 1;
        }
        this.page = page;
    }

    public void setPerPageNum(int perPageNum) {
        if (perPageNum <= 0 || perPageNum > 100) {
            this.perPageNum = 10;
            return;
        }
        this.perPageNum = perPageNum;
    }

    public int getPage() {
        return page;
    }

    public int getPageStart() {
        return (this.page - 1) * perPageNum;
    }

    public int getPerPageNum() {
        return this.perPageNum;
    }

    @Override
    public String toString() {
        return "Criteria{" +
                "page=" + page +
                ", perPageNum=" + perPageNum +
                '}';
    }
}
