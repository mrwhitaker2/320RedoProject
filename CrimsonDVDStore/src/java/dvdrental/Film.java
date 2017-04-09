/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvdrental;

import java.sql.Date;

/**
 *
 * @author mrwhi
 */
public class Film {
    
    private int film_id;
    private String title;
    private String description;
    private Date release_year;
    private int language_id;
    private int originale_language_id;
    private int rental_duration;
    private int rental_rate;
    private int length;
    private int replacement_cost;
    private int rating;
    private int special_features;
    private int last_update;

    /**
     * @return the film_id
     */
    public int getFilm_id() {
        return film_id;
    }

    /**
     * @param film_id the film_id to set
     */
    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the release_year
     */
    public Date getRelease_year() {
        return release_year;
    }

    /**
     * @param release_year the release_year to set
     */
    public void setRelease_year(Date release_year) {
        this.release_year = release_year;
    }

    /**
     * @return the language_id
     */
    public int getLanguage_id() {
        return language_id;
    }

    /**
     * @param language_id the language_id to set
     */
    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    /**
     * @return the originale_language_id
     */
    public int getOriginale_language_id() {
        return originale_language_id;
    }

    /**
     * @param originale_language_id the originale_language_id to set
     */
    public void setOriginale_language_id(int originale_language_id) {
        this.originale_language_id = originale_language_id;
    }

    /**
     * @return the rental_duration
     */
    public int getRental_duration() {
        return rental_duration;
    }

    /**
     * @param rental_duration the rental_duration to set
     */
    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    /**
     * @return the rental_rate
     */
    public int getRental_rate() {
        return rental_rate;
    }

    /**
     * @param rental_rate the rental_rate to set
     */
    public void setRental_rate(int rental_rate) {
        this.rental_rate = rental_rate;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the replacement_cost
     */
    public int getReplacement_cost() {
        return replacement_cost;
    }

    /**
     * @param replacement_cost the replacement_cost to set
     */
    public void setReplacement_cost(int replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the special_features
     */
    public int getSpecial_features() {
        return special_features;
    }

    /**
     * @param special_features the special_features to set
     */
    public void setSpecial_features(int special_features) {
        this.special_features = special_features;
    }

    /**
     * @return the last_update
     */
    public int getLast_update() {
        return last_update;
    }

    /**
     * @param last_update the last_update to set
     */
    public void setLast_update(int last_update) {
        this.last_update = last_update;
    }
    
    
            
    
}
