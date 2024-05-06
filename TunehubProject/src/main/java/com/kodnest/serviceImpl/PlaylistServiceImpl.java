package com.kodnest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Playlist;
import com.kodnest.repository.PlaylistRepository;
import com.kodnest.service.PlaylistService;

@Service
public class PlaylistServiceImpl implements PlaylistService {
	
	@Autowired
	PlaylistRepository playlistRepository;

	@Override
	public void addPlaylist(Playlist playlist) {
		playlistRepository.save(playlist)	;	
	}
	
	@Override
	public boolean playlistExists(String name) {

		Playlist existingpl=playlistRepository.findByName(name);
		if(existingpl != null)
		{
			System.out.println("Present");
			return true;	
		}
		else {
			System.out.println("Absent");
			return false;

		}

	}

	
	@Override
	  public List<Playlist> fetchAllPlaylist() {
	    // TODO Auto-generated method stub
	    List<Playlist> fetchAllPlaylist =  playlistRepository.findAll();
	    return fetchAllPlaylist;
	  }



	
}
