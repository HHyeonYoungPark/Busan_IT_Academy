import React, { useState } from "react";

function Tour({ tour, deleteTour }) {
  const [readMore, setReadMore] = useState(false);

  return (
    <div>
      <section>
        <img src={tour.image} alt={tour.name} />
        <div>
          <h4>{tour.name}</h4>
          <h4>{tour.price}</h4>
        </div>
        <p>
          {readMore ? tour.info : tour.info.substring(0, 100) + "..."}
          <button onClick={() => setReadMore(!readMore)}>
            {readMore ? "줄여보기" : "펼쳐보기"}
          </button>

          <button onClick={() => deleteTour(tour.id)}>삭제하기</button>
        </p>
      </section>
    </div>
  );
}

export default Tour;
