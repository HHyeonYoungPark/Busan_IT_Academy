import React from "react";
import Tour from "./Tour";

function Tours({ tours, deleteTour }) {
  return (
    <div>
      {tours.map((tour, key) => {
        return (
          // readMore useState를 개별적으로 실행시키기 위해 Tour.js로 분리
          <div key={key}>
            <Tour tour={tour} deleteTour={deleteTour} />
          </div>
        );
      })}
    </div>
  );
}

export default Tours;
