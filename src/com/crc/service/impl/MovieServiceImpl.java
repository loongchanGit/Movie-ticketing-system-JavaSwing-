package com.crc.service.impl;

import java.util.List;

import com.crc.dao.MovieDao;
import com.crc.dao.impl.MovieDaoImpl;
import com.crc.entity.Movie;
import com.crc.service.MovieService;

public class MovieServiceImpl implements MovieService {
	private MovieDao movieDao;

	public MovieServiceImpl() {
		movieDao = new MovieDaoImpl();
	}

	@Override
	public int addMovie(Movie movie) {
		// TODO Auto-generated method stub
		Movie m=movieDao.queryMovie(movie);
		if(m==null) {
			boolean res_add =movieDao.addMovie(movie);
			if (res_add) {
				return 1;//添加成功
			}else {
				return 2;//添加失败
			}
		}
		return 3;//添加失败-电影已存在
	}

	@Override
	public boolean delMovie(int mid) {
		// TODO Auto-generated method stub
		return movieDao.delMovie(mid);
	}

	@Override
	public boolean updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieDao.updateMovie(movie);
	}

	@Override
	public List<Movie> queryAllMovie() {
		// TODO Auto-generated method stub
		return movieDao.queryAllMovie();
	}

	@Override
	public List<Movie> OrderMovieTen() {
		// TODO Auto-generated method stub
		return movieDao.OrderMovieTen();
	}

	@Override
	public Movie queryMovieById(int mId) {
		// TODO Auto-generated method stub
		return movieDao.queryMovieById(mId);
	}

	@Override
	public List<Movie> queryMovieByType(String mType) {
		// TODO Auto-generated method stub
		return movieDao.queryMovieByType(mType);
	}

	@Override
	public List<Movie> queryMovieBymovieName(String mName) {
		// TODO Auto-generated method stub
		return movieDao.queryMovieBymovieName(mName);
	}

	@Override
	public Movie queryMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> queryMovieByTypeandName(String mType, String mName) {
		// TODO Auto-generated method stub
		return movieDao.queryMovieByTypeandName(mType, mName);
	}

	@Override
	public Movie queryMovieByName(String mName) {
		// TODO Auto-generated method stub
		return movieDao.queryMovieByName(mName);
	}

}
