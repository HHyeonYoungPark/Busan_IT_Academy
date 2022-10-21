import React from "react";
import { Link } from "react-router-dom";

function Tour({ tour }) {
  return (
    <div className="content-container">
      <div className="title">
        <h2>문화 관광 명소</h2>
        <h3>경상남도의 힘! 아름다운 명소</h3>
      </div>

      <div className="content-wrap">
        {tour.map((tour, key) => {
          return (
            <div className="content" key={key}>
              <img
                style={{ width: "100%" }}
                src={tour.fileurl1}
                alt={tour.fileurl1}
              />
              <h3>
                <Link to="detailview">{tour.data_title}</Link>
              </h3>
              <button className="view-btn">
                <Link to="detailview">상세보기</Link>
              </button>
            </div>
          );
        })}
      </div>
    </div>
  );
}

export default Tour;
