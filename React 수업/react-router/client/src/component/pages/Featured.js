import React from "react";

function Featured() {
  return (
    <div>
      <h2>Lists of Featured Products</h2>
      <div className="featured">
        <table>
          <tr>
            <td>No.</td>
            <td>Item Div.</td>
            <td>Item name.</td>
            <td>Item Price.</td>
            <td>Item Stock.</td>
            <td>Item Discount. </td>
            <td>Item Regdate. </td>
            <td>Item Update/Delete</td>
          </tr>
          <tr>
            <td>1</td>
            <td>
              <select>
                <option>의류</option>
              </select>
            </td>
            <td>
              <strong>
                <u>
                  <a href="#">위대한 과학 고전 30권</a>
                </u>
              </strong>
            </td>
            <td>16,990</td>
            <td>999</td>
            <td>30%</td>
            <td>2022.10.13</td>
            <td>Update/Delete</td>
          </tr>
        </table>
        <div className="bottom">
          <div className="pagination">페이지번호</div>
          <div className="btn-wrap">
            <button>Add Product</button>
          </div>
        </div>
      </div>
    </div>
  );
}

export default Featured;
