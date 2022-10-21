import React from "react";
import { Link } from "react-router-dom";
// 받아온 공공데이터에 사진이 빠진 부분 임의로 넣음
import gimhae from "../images/gimhae.jpg";

function Cultural({ cultural }) {
  return (
    <div className="content-container">
      <div className="title">
        <h2>자주찾는 문화재</h2>
        <h3>경상남도의 힘! 아름다운 문화유산</h3>
      </div>

      <div className="content-wrap">
        {cultural.map((cul, index, key) => {
          return (
            <div className="content" key={key}>
              <img
                style={{ width: "100%" }}
                src={cul.fileurl1 != "" ? cul.fileurl1 : gimhae}
                alt={cul.fileurl1}
              />
              <h3>
                <Link to={"detailview/" + index}>{cul.MYONGCHING}</Link>
              </h3>
              <button className="view-btn">
                <Link to={"detailview/" + index}>상세보기</Link>
              </button>
            </div>
          );
        })}
      </div>
    </div>
  );
}

export default Cultural;
