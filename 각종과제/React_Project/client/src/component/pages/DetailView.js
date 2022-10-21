import React from "react";
import { Link, useParams } from "react-router-dom";
import gimhae from "../images/gimhae.jpg";

function DetailView({ cultural }) {
  const { id } = useParams();
  console.log(id);

  return (
    <div className="detailview">
      <div className="detailview-wrap">
        <div className="cul-name">
          <h1>{cultural[id].MYONGCHING}</h1>
        </div>
        <div className="cul-content-wrap">
          <div className="content-grid">
            <ul>
              <li>
                <span className="li-title">소재지</span>
                <span className="li-add">
                  {cultural[id].ADDRESS1 == null
                    ? "정보없음"
                    : cultural[id].ADDRESS1}
                </span>
              </li>
              <li>
                <span className="li-title">시대</span>
                <span className="li-add">
                  {cultural[id].SIDAE == null ? "정보없음" : cultural[id].SIDAE}
                </span>
              </li>
              <li>
                <span className="li-title">지정번호</span>
                <span className="li-add">
                  {cultural[id].DOJIJUNG_NO == null
                    ? "정보없음"
                    : cultural[id].DOJIJUNG_NO}
                </span>
              </li>
              <li>
                <span className="li-title">지정일</span>
                <span className="li-add">
                  {cultural[id].JIJUNG_DATE == null
                    ? "정보없음"
                    : cultural[id].JIJUNG_DATE}
                </span>
              </li>
              <li>
                <span className="li-title">수량(면적)</span>
                <span className="li-add">
                  {cultural[id].MYONJUK == null
                    ? "정보없음"
                    : cultural[id].MYONJUK}
                </span>
              </li>
              <li>
                <span className="li-title">한문명</span>
                <span className="li-add">
                  {cultural[id].MYONGCHING_HANMUN == null
                    ? "정보없음"
                    : cultural[id].MYONGCHING_HANMUN}
                </span>
              </li>
              <li>
                <span className="li-title">관리자</span>
                <span className="li-add">
                  {cultural[id].ADMIN_NAME == null
                    ? "정보없음"
                    : cultural[id].ADMIN_NAME}
                </span>
              </li>
            </ul>
          </div>
          <div className="contxt">
            <p>{cultural[id].CONTENT}</p>
          </div>
        </div>
        <div className="cul-image">
          <img
            src={cultural[id].fileurl1 != "" ? cultural[id].fileurl1 : gimhae}
            alt={cultural[id].fileurl1}
          />
          <img src={cultural[id].fileurl2} alt={cultural[id].fileurl2} />
          <img src={cultural[id].fileurl3} alt={cultural[id].fileurl3} />
        </div>
        <div className="btn-box">
          <button className="list-btn">
            <Link to="/">목록</Link>
          </button>
        </div>
      </div>
    </div>
  );
}

export default DetailView;
