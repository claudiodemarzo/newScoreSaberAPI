package core.schemas;

public class Metadata {
    private int total, page, itemsPerPage;

    public Metadata(int total, int page, int itemsPerPage) {
        this.total = total;
        this.page = page;
        this.itemsPerPage = itemsPerPage;
    }

    public int getTotal() {
        return total;
    }

    public int getPage() {
        return page;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }
}
