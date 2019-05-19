package com.struts2stuff.struts2.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.struts2stuff.struts2.beans.ListElementBean;

public final class HomeAction extends BaseAction {

	private static final Logger LOG = LogManager.getLogger(HomeAction.class);

	private String submit;
	private Map<Integer, Boolean> selected;
	private List<ListElementBean> beanList;

	public HomeAction() {
		LOG.trace("called");
		this.selected = new HashMap<>();
		this.beanList = new ArrayList<>();
		
		this.beanList.add(new ListElementBean("Entry One"));
		this.beanList.add(new ListElementBean("Entry Two"));
		this.beanList.add(new ListElementBean("Entry Three"));
	}

	@Override
	public String execute() throws Exception {
		LOG.trace("called");

		if (this.submit != null) {
			LOG.trace("Map: {}", this.selected);
			return Action.SUCCESS;
		}

		return Action.INPUT;
	}

	public Map<Integer, Boolean> getSelected() {
		LOG.trace("called");
		return this.selected;
	}

	public void setSelected(Map<Integer, Boolean> selected) {
		LOG.trace("called");
		this.selected = selected;
	}

	public List<ListElementBean> getBeanList() {
		LOG.trace("called");
		return this.beanList;
	}

	public void setBeanList(List<ListElementBean> beanList) {
		LOG.trace("called");
		this.beanList = beanList;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}
}
