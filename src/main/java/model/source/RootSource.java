package model.source;

import java.util.ArrayList;

public class RootSource {
    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public ArrayList<Datum> data;
    public Support support;

    @Override
    public String toString() {
        return "Root{" +
                "page=" + page +
                ", per_page=" + per_page +
                ", total=" + total +
                ", total_pages=" + total_pages +
                ", data=" + data +
                ", support=" + support +
                '}';
    }
}
