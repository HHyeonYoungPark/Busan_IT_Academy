import React from "react";

function Tour({ tour }) {
  return (
    <div>
      {tour.map((tour, key) => {
        return (
          <div key={key}>
            <img
              style={{ width: "400px" }}
              src={tour.fileurl1}
              alt={tour.fileurl1}
            />
            <h2>{tour.data_title}</h2>
            <h3>{tour.user_address}</h3>
            <p>{tour.data_content}</p>
            <h3>{tour.traffic}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default Tour;
