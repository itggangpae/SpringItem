package com.choongang.item.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choongang.item.domain.Item;

@Repository
public class ItemDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<Item> getAll() {
		return (List<Item>)sessionFactory.getCurrentSession().createCriteria(Item.class).list();
	}

	public Item getItem(Integer itemid) {
		Item item = (Item)sessionFactory.getCurrentSession().get(Item.class, itemid);
		return item;
	}

}
