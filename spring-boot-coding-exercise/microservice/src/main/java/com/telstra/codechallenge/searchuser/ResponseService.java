package com.telstra.codechallenge.searchuser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResponseService {
	
	@Value("${user.search.base.url}")
	private String userSearchUrl;
	
	@Autowired
	RestTemplate restTemplate;

	public List<User> getUser(int numberOfAccount) {
		
		Response response = restTemplate.getForObject(userSearchUrl, Response.class);
		List<User> usersList = new ArrayList<User>();
		if(response !=null && response.getItems()!=null && numberOfAccount>0)
		{
			List<Item> itemsList = response.getItems();
					
			for(int i=0; i<numberOfAccount; i++)
				{	
				User user = new User();
				user.setId(itemsList.get(i).getId());
				user.setLogin(itemsList.get(i).getLogin());
				user.setHtml_url(itemsList.get(i).getHtml_url());
				usersList.add(user);
				}
			
		}
		return usersList;
		}
		
	}


