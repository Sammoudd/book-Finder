package com.example.book.serviceImpl;

import com.example.book.model.Book;
import com.example.book.model.ResponseJson;
import com.example.book.service.BookService;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import org.springframework.stereotype.Component;

@Component
public class BookServiceImplementation implements BookService {

	@Override
	public ResponseJson search(String query) {

		URL url = null;
		try {
			url = new URL("https://www.googleapis.com/books/v1/volumes?q=" + query);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; utf-8");
			con.setRequestProperty("Accept", "application/json");

			con.setDoOutput(true);

			try (BufferedReader br = new BufferedReader(
					new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
				StringBuilder response = new StringBuilder();
				String responseLine;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println("Api response : " + response);

				Gson gson = new Gson();
				ResponseJson responseJson = gson.fromJson(response.toString(), ResponseJson.class);

				System.out.println("response : " + responseJson.toString());
				return responseJson;
			}
		} catch (IOException e) {
			return new ResponseJson();
		}
	}

	@Override
	public Book findBookById(String id) {
		URL url = null;
		try {
			url = new URL("https://www.googleapis.com/books/v1/volumes/" + id);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; utf-8");
			con.setRequestProperty("Accept", "application/json");

			con.setDoOutput(true);

			try (BufferedReader br = new BufferedReader(
					new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
				StringBuilder response = new StringBuilder();
				String responseLine;
				while ((responseLine = br.readLine()) != null) {
					response.append(responseLine.trim());
				}
				System.out.println("Api response : " + response);

				Gson gson = new Gson();
				Book book = gson.fromJson(response.toString(), Book.class);

				System.out.println("response : " + book.toString());
				return book;
			}
		} catch (IOException e) {
			return new Book();
		}
	

}
}
