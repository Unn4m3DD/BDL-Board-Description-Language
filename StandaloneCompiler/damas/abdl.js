import ABDLVar from "./AbdlVar.js"
var context;
var table;
var render;
const sleep = (milliseconds) => {
  return new Promise(resolve => setTimeout(resolve, milliseconds))
}
const range = (a, b) => {
  const result = [];
  for (let i = a.getValue(); i <= b.getValue(); i++) result.push(new ABDLVar(i));
  return result;
}
const getName = (a) => {
  try {
    return new ABDLVar(context.board[a.getValue()[0]][a.getValue()[1]].piece.name)
  } catch (e) {
    return new ABDLVar("");
  }
}
const getOwner = (a) => {
  try {
    return new ABDLVar(context.board[a.getValue()[0]][a.getValue()[1]].piece.owner)
  } catch (e) {
    return new ABDLVar(-1);
  }
}
const move = async (origin, destination) => {
  try {
    table[origin.getValue()[0]][origin.getValue()[1]].onclick();
    render(context, table)
    await sleep(1000);
    table[destination.getValue()[0]][destination.getValue()[1]].onclick();
    render(context, table)
    return new ABDLVar(1);
  } catch (e) {
    return new ABDLVar(0);
  }
}
const can_move = async (origin, destination) => {
  let result
  try{
    if (!table[origin.getValue()[0]][origin.getValue()[1]].onclick) return new ABDLVar(0);
      table[origin.getValue()[0]][origin.getValue()[1]].onclick();
  } catch(e) { return new ABDLVar(0); }
  render(context, table)
  try {
    if (
      table[destination.getValue()[0]][destination.getValue()[1]].style.backgroundColor ==
      "rgb(100, 200, 100)"
    )//rgb(100, 200, 100)
      result = new ABDLVar(1);
    else
      result = new ABDLVar(0);
  } catch (e) { result = new ABDLVar(0); }
  context.focused.x = -1;
  context.focused.y = -1;
  render(context, table);
  return result
}
export default {
  on_move: async (arg_context, arg_table, arg_render) => {
      let v215 = new ABDLVar(context.current_player);
      console.log(v215.toString());
      let v217 = new ABDLVar(context.current_player);
      let v219 = new ABDLVar(1);
      let v218 = v219.mul(new ABDLVar(-1));
      let v216 = v217.equal(v218);
      if (v216.getValue() != 0) {
         let v220 = new ABDLVar(0);
         return v220;
      }
      let v222 = new ABDLVar(context.current_player);
      let v221 = new ABDLVar( await f0(v222));
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v214 = new ABDLVar(context.current_player);
    let v213 = new ABDLVar( await f0(v214));
  }
}
async function f0(v0){
  let v2 = new ABDLVar(0);
  let v4 = new ABDLVar(context.height);
  let v5 = new ABDLVar(1);
  let v3 = v4.sub(v5);
  let v1 = new ABDLVar([v2, v3]);
  let v6 = v1;
  let v9 = new ABDLVar(context.width);
  let v10 = new ABDLVar(1);
  let v8 = v9.sub(v10);
  let v11 = new ABDLVar(0);
  let v7 = new ABDLVar([v8, v11]);
  let v12 = v7;
  let v14 = new ABDLVar(0);
  let v16 = new ABDLVar(context.height);
  let v17 = new ABDLVar(1);
  let v15 = v16.sub(v17);
  let v13 = new ABDLVar([v14, v15]);
  let v18 = v13;
  let v20 = new ABDLVar(0);
  let v19 = v0.equal(v20);
  if (v19.getValue() != 0) {
     let v23 = new ABDLVar(context.width);
     let v24 = new ABDLVar(1);
     let v22 = v23.sub(v24);
     let v25 = new ABDLVar(0);
     let v21 = new ABDLVar([v22, v25]);
     v6 = v21;
     let v27 = new ABDLVar(0);
     let v29 = new ABDLVar(context.height);
     let v30 = new ABDLVar(1);
     let v28 = v29.sub(v30);
     let v26 = new ABDLVar([v27, v28]);
     v12 = v26;
     let v33 = new ABDLVar(context.width);
     let v34 = new ABDLVar(1);
     let v32 = v33.sub(v34);
     let v35 = new ABDLVar(0);
     let v31 = new ABDLVar([v32, v35]);
     v18 = v31;
  }
  let v36 = new ABDLVar(0);
  let v38 = new ABDLVar(context.width);
  let v39 = new ABDLVar(1);
  let v37 = v38.sub(v39);
  for(let v40 of range(v36,v37)) {
    let v41 = new ABDLVar(0);
    let v43 = new ABDLVar(context.height);
    let v44 = new ABDLVar(1);
    let v42 = v43.sub(v44);
    for(let v45 of range(v41,v42)) {
      let v47 = new ABDLVar([v40, v45]);
      let v46 = (getOwner(v47)).equal(v0);
      if (v46.getValue() != 0) {
         let v48 = new ABDLVar([v40, v45]);
         let v49 = (await f1(v48, v6, v0));
         let v51 = new ABDLVar([v40, v45]);
         let v50 = (await f2(v51, v49, v6)).greater_than((await f2(v18, v12, v6)));
         if (v50.getValue() != 0) {
            v12 = v49;
            let v52 = new ABDLVar([v40, v45]);
            v18 = v52;
         }
      }
    }
  }
  await move(v18, v12);
}
async function f1(v53, v54, v55){
  let v58 = new ABDLVar(context.width);
  let v59 = new ABDLVar(1);
  let v57 = v58.sub(v59);
  let v60 = new ABDLVar(0);
  let v56 = new ABDLVar([v57, v60]);
  let v61 = v56;
  let v63 = new ABDLVar(0);
  let v62 = v55.equal(v63);
  if (v62.getValue() != 0) {
     let v65 = new ABDLVar(0);
     let v67 = new ABDLVar(context.height);
     let v68 = new ABDLVar(1);
     let v66 = v67.sub(v68);
     let v64 = new ABDLVar([v65, v66]);
     v61 = v64;
  }
  let v70 = new ABDLVar(2);
  let v69 = v70.mul(new ABDLVar(-1));
  let v71 = new ABDLVar(2);
  for(let v72 of range(v69,v71)) {
    let v74 = new ABDLVar(2);
    let v73 = v74.mul(new ABDLVar(-1));
    let v75 = new ABDLVar(2);
    for(let v76 of range(v73,v75)) {
      let v79 = new ABDLVar([v72, v76]);
      let v81 = new ABDLVar(0);
      let v82 = new ABDLVar(0);
      let v80 = new ABDLVar([v81, v82]);
      let v78 = v79.not_equal(v80);
      let v84 = new ABDLVar([v72, v76]);
      let v83 = v53.add(v84);
      let v77 = v78.and((await can_move(v53, v83)));
      if (v77.getValue() != 0) {
         let v87 = new ABDLVar([v72, v76]);
         let v86 = v53.add(v87);
         let v85 = (await f2(v53, v86, v54)).greater_than((await f2(v53, v61, v54)));
         if (v85.getValue() != 0) {
            let v89 = new ABDLVar([v72, v76]);
            let v88 = v53.add(v89);
            v61 = v88;
         }
      }
    }
  }
  return v61;
}
async function f2(v90, v91, v92){
  let v93 = (await f3(v90, v92)).sub((await f3(v91, v92)));
  return v93;
}
async function f3(v94, v95){
  let v99 = new ABDLVar(0);
  let v98 = new ABDLVar(v94.getValue()[v99.getValue()]);
  let v101 = new ABDLVar(0);
  let v100 = new ABDLVar(v95.getValue()[v101.getValue()]);
  let v97 = v98.sub(v100);
  let v104 = new ABDLVar(1);
  let v103 = new ABDLVar(v94.getValue()[v104.getValue()]);
  let v106 = new ABDLVar(1);
  let v105 = new ABDLVar(v95.getValue()[v106.getValue()]);
  let v102 = v103.sub(v105);
  let v96 = (await f4(v97)).add((await f4(v102)));
  return v96;
}
async function f4(v107){
  let v109 = new ABDLVar(0);
  let v108 = v107.greater_than(v109);
  if (v108.getValue() != 0) {
     return v107;
  }
  else {
     let v110 = v107.mul(new ABDLVar(-1));
     return v110;
  }
}
async function f5(){
  let v112 = new ABDLVar(0);
  let v113 = new ABDLVar(0);
  let v111 = new ABDLVar([v112, v113]);
  let v114 = v111;
  let v116 = new ABDLVar(0);
  let v117 = new ABDLVar(0);
  let v115 = new ABDLVar([v116, v117]);
  let v118 = v115;
  let v119 = new ABDLVar(0);
  let v120 = v119;
  let v121 = new ABDLVar(0);
  let v123 = new ABDLVar(context.width);
  let v124 = new ABDLVar(1);
  let v122 = v123.sub(v124);
  for(let v125 of range(v121,v122)) {
    let v126 = new ABDLVar(0);
    let v128 = new ABDLVar(context.height);
    let v129 = new ABDLVar(1);
    let v127 = v128.sub(v129);
    for(let v130 of range(v126,v127)) {
      let v132 = new ABDLVar([v125, v130]);
      let v133 = new ABDLVar(0);
      let v131 = (getOwner(v132)).equal(v133);
      if (v131.getValue() != 0) {
         let v134 = new ABDLVar([v125, v130]);
         let v135 = (await f6(v134));
         let v136 = (await f8(v135)).greater_than((await f8(v118)));
         if (v136.getValue() != 0) {
            let v137 = new ABDLVar([v125, v130]);
            v114 = v137;
            v118 = v135;
         }
      }
    }
  }
  let v140 = new ABDLVar(0);
  let v141 = new ABDLVar(0);
  let v139 = new ABDLVar([v140, v141]);
  let v138 = v118.equal(v139);
  if (v138.getValue() != 0) {
     let v144 = new ABDLVar(context.width);
     let v145 = new ABDLVar(1);
     let v143 = v144.sub(v145);
     let v147 = new ABDLVar(context.height);
     let v148 = new ABDLVar(1);
     let v146 = v147.sub(v148);
     let v142 = new ABDLVar([v143, v146]);
     v118 = v142;
     let v149 = new ABDLVar(0);
     let v151 = new ABDLVar(context.width);
     let v152 = new ABDLVar(1);
     let v150 = v151.sub(v152);
     for(let v153 of range(v149,v150)) {
       let v154 = new ABDLVar(0);
       let v156 = new ABDLVar(context.height);
       let v157 = new ABDLVar(1);
       let v155 = v156.sub(v157);
       for(let v158 of range(v154,v155)) {
         let v160 = new ABDLVar([v153, v158]);
         let v161 = new ABDLVar(0);
         let v159 = (getOwner(v160)).equal(v161);
         if (v159.getValue() != 0) {
            let v162 = new ABDLVar([v153, v158]);
            let v163 = (await f7(v162));
            let v164 = (await f8(v163)).greater_than((await f8(v118)));
            if (v164.getValue() != 0) {
               let v165 = new ABDLVar([v153, v158]);
               v114 = v165;
               v118 = v163;
            }
         }
       }
     }
  }
  let v166 = v114.not_equal(v118);
  if (v166.getValue() != 0) {
     let v167 = v114.add(v118);
     await move(v114, v167);
  }
}
async function f6(v168){
  let v170 = new ABDLVar(0);
  let v171 = new ABDLVar(0);
  let v169 = new ABDLVar([v170, v171]);
  let v172 = v169;
  let v173 = new ABDLVar(0);
  let v174 = new ABDLVar(2);
  for(let v175 of range(v173,v174)) {
    let v177 = new ABDLVar(2);
    let v176 = v177.mul(new ABDLVar(-1));
    let v178 = new ABDLVar(0);
    for(let v179 of range(v176,v178)) {
      let v181 = new ABDLVar([v175, v179]);
      let v180 = v168.add(v181);
      if ((await can_move(v168, v180)).getValue() != 0) {
         let v183 = new ABDLVar([v175, v179]);
         let v182 = (await f8(v183)).greater_than((await f8(v172)));
         if (v182.getValue() != 0) {
            let v184 = new ABDLVar([v175, v179]);
            v172 = v184;
         }
      }
    }
  }
  return v172;
}
async function f7(v185){
  let v188 = new ABDLVar(2);
  let v187 = v188.mul(new ABDLVar(-1));
  let v189 = new ABDLVar(2);
  let v186 = new ABDLVar([v187, v189]);
  let v190 = v186;
  let v192 = new ABDLVar(2);
  let v191 = v192.mul(new ABDLVar(-1));
  let v193 = new ABDLVar(0);
  for(let v194 of range(v191,v193)) {
    let v195 = new ABDLVar(0);
    let v196 = new ABDLVar(2);
    for(let v197 of range(v195,v196)) {
      let v199 = new ABDLVar([v194, v197]);
      let v198 = v185.add(v199);
      if ((await can_move(v185, v198)).getValue() != 0) {
         let v201 = new ABDLVar([v194, v197]);
         let v200 = (await f8(v201)).less_than((await f8(v190)));
         if (v200.getValue() != 0) {
            let v202 = new ABDLVar([v194, v197]);
            v190 = v202;
         }
      }
    }
  }
  return v190;
}
async function f8(v203){
  let v207 = new ABDLVar(0);
  let v206 = new ABDLVar(v203.getValue()[v207.getValue()]);
  let v208 = new ABDLVar(2);
  let v205 = v206.pow(v208);
  let v211 = new ABDLVar(1);
  let v210 = new ABDLVar(v203.getValue()[v211.getValue()]);
  let v212 = new ABDLVar(2);
  let v209 = v210.pow(v212);
  let v204 = v205.add(v209);
  return v204;
}