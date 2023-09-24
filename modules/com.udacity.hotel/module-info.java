module com.udacity.hotel
{
    exports com.udacity.hotel.model;
    exports com.udacity.hotel.search;
    opens com.udacity.hotel.model to com.udacity.packagesearch;
}