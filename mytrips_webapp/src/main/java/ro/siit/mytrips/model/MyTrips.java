package ro.siit.mytrips.model;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name="trips")
public class MyTrips {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Size(min = 2, max = 30, message = "Cel putin 2 caractere / maxim 30 caractere")
    private String tripname;
    private String impressions;
    private String location;

//    @Email(message = "Your email is invalid!")//validare pt trsing email
//    @NotBlank // validare blank-uri
//    private String email;

    @Column(name="datefrom")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateFrom;

    @Column(name="dateto")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateTo;

    public int getId (){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getName() {
        return tripname;
    }

    public String getImpressions(){return impressions;}

    public String getLocation() {
        return location;
    }

    //    public String getEmail() {
//        return email;
//    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setName(String tripname) {
        this.tripname = tripname;
    }

    public void setImpressions(String impressions){this.impressions = impressions;}

    public void setLocation(String location){this.location = location;}

    // public void setEmail(String email) {
    //    this.email = email;
    //}

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    @Override
    public String toString() {
        return "My trips{" +
                "id=" + id +
                ", name ='" + tripname + '\'' +
                ", impressions ='" + impressions +'\'' +
                ", date from ='" + dateFrom + '\'' +
                ", date to =" + dateTo +
                ", location ='" + location +'\'' +
                '}';
    }
}
