package com.kodnest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.Song;

import com.kodnest.repository.SongRepository;
import com.kodnest.service.SongService;

@Service
public class SongServiceImpl implements SongService {


	@Autowired
	SongRepository songRepository;


	@Override
	public void saveSong(Song song) {

		songRepository.save(song);
	}


	@Override
	public boolean songExists(String name) {

		Song existingsong=songRepository.findByName(name);
		if(existingsong != null)
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
	public List<Song> fetchAllSongs() {
		
		List<Song> songs = songRepository.findAll();
		return songs;
		}


	@Override
	public void updateSong(Song song) {
		songRepository.save(song);
		
	}
}





