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
    await sleep(10);
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
      let v214 = new ABDLVar(context.current_player);
      console.log(v214.toString());
      let v216 = new ABDLVar(context.current_player);
      let v218 = new ABDLVar(1);
      let v217 = v218.mul(new ABDLVar(-1));
      let v215 = v216.equal(v217);
      if (v215.getValue() != 0) {
         let v219 = new ABDLVar(0);
         return v219;
      }
      let v221 = new ABDLVar(context.current_player);
      let v220 = new ABDLVar( await f0(v221));
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v213 = new ABDLVar(context.current_player);
    let v212 = new ABDLVar( await f0(v213));
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
      let v78 = new ABDLVar([v72, v76]);
      let v80 = new ABDLVar(0);
      let v81 = new ABDLVar(0);
      let v79 = new ABDLVar([v80, v81]);
      let v77 = v78.not_equal(v79);
      if (v77.getValue() != 0) {
         let v83 = new ABDLVar([v72, v76]);
         let v82 = v53.add(v83);
         if ((await can_move(v53, v82)).getValue() != 0) {
            let v86 = new ABDLVar([v72, v76]);
            let v85 = v53.add(v86);
            let v84 = (await f2(v53, v85, v54)).greater_than((await f2(v53, v61, v54)));
            if (v84.getValue() != 0) {
               let v88 = new ABDLVar([v72, v76]);
               let v87 = v53.add(v88);
               v61 = v87;
            }
         }
      }
    }
  }
  return v61;
}
async function f2(v89, v90, v91){
  let v92 = (await f3(v89, v91)).sub((await f3(v90, v91)));
  return v92;
}
async function f3(v93, v94){
  let v98 = new ABDLVar(0);
  let v97 = new ABDLVar(v93.getValue()[v98.getValue()]);
  let v100 = new ABDLVar(0);
  let v99 = new ABDLVar(v94.getValue()[v100.getValue()]);
  let v96 = v97.sub(v99);
  let v103 = new ABDLVar(1);
  let v102 = new ABDLVar(v93.getValue()[v103.getValue()]);
  let v105 = new ABDLVar(1);
  let v104 = new ABDLVar(v94.getValue()[v105.getValue()]);
  let v101 = v102.sub(v104);
  let v95 = (await f4(v96)).add((await f4(v101)));
  return v95;
}
async function f4(v106){
  let v108 = new ABDLVar(0);
  let v107 = v106.greater_than(v108);
  if (v107.getValue() != 0) {
     return v106;
  }
  else {
     let v109 = v106.mul(new ABDLVar(-1));
     return v109;
  }
}
async function f5(){
  let v111 = new ABDLVar(0);
  let v112 = new ABDLVar(0);
  let v110 = new ABDLVar([v111, v112]);
  let v113 = v110;
  let v115 = new ABDLVar(0);
  let v116 = new ABDLVar(0);
  let v114 = new ABDLVar([v115, v116]);
  let v117 = v114;
  let v118 = new ABDLVar(0);
  let v119 = v118;
  let v120 = new ABDLVar(0);
  let v122 = new ABDLVar(context.width);
  let v123 = new ABDLVar(1);
  let v121 = v122.sub(v123);
  for(let v124 of range(v120,v121)) {
    let v125 = new ABDLVar(0);
    let v127 = new ABDLVar(context.height);
    let v128 = new ABDLVar(1);
    let v126 = v127.sub(v128);
    for(let v129 of range(v125,v126)) {
      let v131 = new ABDLVar([v124, v129]);
      let v132 = new ABDLVar(0);
      let v130 = (getOwner(v131)).equal(v132);
      if (v130.getValue() != 0) {
         let v133 = new ABDLVar([v124, v129]);
         let v134 = (await f6(v133));
         let v135 = (await f8(v134)).greater_than((await f8(v117)));
         if (v135.getValue() != 0) {
            let v136 = new ABDLVar([v124, v129]);
            v113 = v136;
            v117 = v134;
         }
      }
    }
  }
  let v139 = new ABDLVar(0);
  let v140 = new ABDLVar(0);
  let v138 = new ABDLVar([v139, v140]);
  let v137 = v117.equal(v138);
  if (v137.getValue() != 0) {
     let v143 = new ABDLVar(context.width);
     let v144 = new ABDLVar(1);
     let v142 = v143.sub(v144);
     let v146 = new ABDLVar(context.height);
     let v147 = new ABDLVar(1);
     let v145 = v146.sub(v147);
     let v141 = new ABDLVar([v142, v145]);
     v117 = v141;
     let v148 = new ABDLVar(0);
     let v150 = new ABDLVar(context.width);
     let v151 = new ABDLVar(1);
     let v149 = v150.sub(v151);
     for(let v152 of range(v148,v149)) {
       let v153 = new ABDLVar(0);
       let v155 = new ABDLVar(context.height);
       let v156 = new ABDLVar(1);
       let v154 = v155.sub(v156);
       for(let v157 of range(v153,v154)) {
         let v159 = new ABDLVar([v152, v157]);
         let v160 = new ABDLVar(0);
         let v158 = (getOwner(v159)).equal(v160);
         if (v158.getValue() != 0) {
            let v161 = new ABDLVar([v152, v157]);
            let v162 = (await f7(v161));
            let v163 = (await f8(v162)).greater_than((await f8(v117)));
            if (v163.getValue() != 0) {
               let v164 = new ABDLVar([v152, v157]);
               v113 = v164;
               v117 = v162;
            }
         }
       }
     }
  }
  let v165 = v113.not_equal(v117);
  if (v165.getValue() != 0) {
     let v166 = v113.add(v117);
     await move(v113, v166);
  }
}
async function f6(v167){
  let v169 = new ABDLVar(0);
  let v170 = new ABDLVar(0);
  let v168 = new ABDLVar([v169, v170]);
  let v171 = v168;
  let v172 = new ABDLVar(0);
  let v173 = new ABDLVar(2);
  for(let v174 of range(v172,v173)) {
    let v176 = new ABDLVar(2);
    let v175 = v176.mul(new ABDLVar(-1));
    let v177 = new ABDLVar(0);
    for(let v178 of range(v175,v177)) {
      let v180 = new ABDLVar([v174, v178]);
      let v179 = v167.add(v180);
      if ((await can_move(v167, v179)).getValue() != 0) {
         let v182 = new ABDLVar([v174, v178]);
         let v181 = (await f8(v182)).greater_than((await f8(v171)));
         if (v181.getValue() != 0) {
            let v183 = new ABDLVar([v174, v178]);
            v171 = v183;
         }
      }
    }
  }
  return v171;
}
async function f7(v184){
  let v187 = new ABDLVar(2);
  let v186 = v187.mul(new ABDLVar(-1));
  let v188 = new ABDLVar(2);
  let v185 = new ABDLVar([v186, v188]);
  let v189 = v185;
  let v191 = new ABDLVar(2);
  let v190 = v191.mul(new ABDLVar(-1));
  let v192 = new ABDLVar(0);
  for(let v193 of range(v190,v192)) {
    let v194 = new ABDLVar(0);
    let v195 = new ABDLVar(2);
    for(let v196 of range(v194,v195)) {
      let v198 = new ABDLVar([v193, v196]);
      let v197 = v184.add(v198);
      if ((await can_move(v184, v197)).getValue() != 0) {
         let v200 = new ABDLVar([v193, v196]);
         let v199 = (await f8(v200)).less_than((await f8(v189)));
         if (v199.getValue() != 0) {
            let v201 = new ABDLVar([v193, v196]);
            v189 = v201;
         }
      }
    }
  }
  return v189;
}
async function f8(v202){
  let v206 = new ABDLVar(0);
  let v205 = new ABDLVar(v202.getValue()[v206.getValue()]);
  let v207 = new ABDLVar(2);
  let v204 = v205.pow(v207);
  let v210 = new ABDLVar(1);
  let v209 = new ABDLVar(v202.getValue()[v210.getValue()]);
  let v211 = new ABDLVar(2);
  let v208 = v209.pow(v211);
  let v203 = v204.add(v208);
  return v203;
}