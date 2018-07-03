package giang.test;

import java.util.List;

public class Title {
	private String ipTitleId;
    private String ipTitle;
    private List<String> type;
    private String page;
    private String size;
    private String sort;
    private String sortBy;
    private List<Long> ids;
    
	public String getIpTitleId() {
		return ipTitleId;
	}
	public void setIpTitleId(String ipTitleId) {
		this.ipTitleId = ipTitleId;
	}
	public String getIpTitle() {
		return ipTitle;
	}
	public void setIpTitle(String ipTitle) {
		this.ipTitle = ipTitle;
	}
	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getSortBy() {
		return sortBy;
	}
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	public List<Long> getIds() {
		return ids;
	}
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}
}
