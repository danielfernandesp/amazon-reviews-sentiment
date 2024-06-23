package com.kg.lambda;

public class AWSReview {

    // Fields to store review details
    private String marketplace;
    private String customer_id;
    private String review_id;
    private String product_id;
    private String product_parent;
    private String product_title;
    private String product_category;
    private String star_rating;
    private String helpful_votes;
    private String total_votes;
    private String vine;
    private String verified_purchase;
    private String review_headline;
    private String review_body;
    private String review_date;

    // Constructor to initialize all fields using method calls
    public AWSReview(String marketplace, String customer_id, String review_id, String product_id, String product_parent,
                     String product_title, String product_category, String star_rating, String helpful_votes, String total_votes,
                     String vine, String verified_purchase, String review_headline, String review_body, String review_date) {
        setMarketplace(marketplace);
        setCustomer_id(customer_id);
        setReview_id(review_id);
        setProduct_id(product_id);
        setProduct_parent(product_parent);
        setProduct_title(product_title);
        setProduct_category(product_category);
        setStar_rating(star_rating);
        setHelpful_votes(helpful_votes);
        setTotal_votes(total_votes);
        setVine(vine);
        setVerified_purchase(verified_purchase);
        setReview_headline(review_headline);
        setReview_body(review_body);
        setReview_date(review_date);
    }

    // Getter and Setter for marketplace
    public String getMarketplace() {
        return marketplace;
    }
    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    // Getter and Setter for customer_id
    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    // Getter and Setter for review_id
    public String getReview_id() {
        return review_id;
    }
    public void setReview_id(String review_id) {
        this.review_id = review_id;
    }

    // Getter and Setter for product_id
    public String getProduct_id() {
        return product_id;
    }
    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    // Getter and Setter for product_parent
    public String getProduct_parent() {
        return product_parent;
    }
    public void setProduct_parent(String product_parent) {
        this.product_parent = product_parent;
    }

    // Getter and Setter for product_title
    public String getProduct_title() {
        return product_title;
    }
    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    // Getter and Setter for product_category
    public String getProduct_category() {
        return product_category;
    }
    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    // Getter and Setter for star_rating
    public String getStar_rating() {
        return star_rating;
    }
    public void setStar_rating(String star_rating) {
        this.star_rating = star_rating;
    }

    // Getter and Setter for helpful_votes
    public String getHelpful_votes() {
        return helpful_votes;
    }
    public void setHelpful_votes(String helpful_votes) {
        this.helpful_votes = helpful_votes;
    }

    // Getter and Setter for total_votes
    public String getTotal_votes() {
        return total_votes;
    }
    public void setTotal_votes(String total_votes) {
        this.total_votes = total_votes;
    }

    // Getter and Setter for vine
    public String getVine() {
        return vine;
    }
    public void setVine(String vine) {
        this.vine = vine;
    }

    // Getter and Setter for verified_purchase
    public String getVerified_purchase() {
        return verified_purchase;
    }
    public void setVerified_purchase(String verified_purchase) {
        this.verified_purchase = verified_purchase;
    }

    // Getter and Setter for review_headline
    public String getReview_headline() {
        return review_headline;
    }
    public void setReview_headline(String review_headline) {
        this.review_headline = review_headline;
    }

    // Getter and Setter for review_body
    public String getReview_body() {
        return review_body;
    }
    public void setReview_body(String review_body) {
        this.review_body = review_body;
    }

    // Getter and Setter for review_date
    public String getReview_date() {
        return review_date;
    }
    public void setReview_date(String review_date) {
        this.review_date = review_date;
    }

    // toString method to display all review details as a string
    @Override
    public String toString() {
        return "AWSReview [marketplace=" + marketplace + ", customer_id=" + customer_id + ", review_id=" + review_id
                + ", product_id=" + product_id + ", product_parent=" + product_parent + ", product_title="
                + product_title + ", product_category=" + product_category + ", star_rating=" + star_rating
                + ", helpful_votes=" + helpful_votes + ", total_votes=" + total_votes + ", vine=" + vine
                + ", verified_purchase=" + verified_purchase + ", review_headline=" + review_headline + ", review_body="
                + review_body + ", review_date=" + review_date + "]";
    }

}
