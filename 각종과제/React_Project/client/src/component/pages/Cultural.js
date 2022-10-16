import React from "react";
import { Link } from "react-router-dom";

function Cultural({ cultural }) {
  return (
    <div className="content-container">
      <div className="title">
        <h2>자주찾는 문화재</h2>
        <h3>경상남도의 힘! 아름다운 문화유산</h3>
      </div>

      <div className="content-wrap">
        {cultural.map((cul, key) => {
          return (
            <div className="content" key={key}>
              <img
                style={{ width: "100%" }}
                src={cul.fileurl1}
                alt={cul.fileurl1}
              />
              <h3>
                <Link to="detailview">{cul.MYONGCHING}</Link>
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

export default Cultural;
